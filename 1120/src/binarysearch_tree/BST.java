package binarysearch_tree;

public class BST {
    private Node root;

    public BST(){
        root=null;
    }

    //查找
    public boolean search(Integer key){
        Node current=root;

        while(current!=null){
            int cmp=key.compareTo(current.key);
            if(cmp==0){
                return true;
            }else if(cmp<0){
                current=current.left;
            }
            current=current.right;
        }
        return false;
    }

    //插入
    public void insert(Integer key){
        if(root==null){
            root=new Node(key);
            return;
        }
        Node parent=null;
        Node current=root;

        int cmp=0;
        while(current!=null){
            cmp=key.compareTo(current.key);
            if(cmp==0){
                throw new RuntimeException("BST中不允许出现相同的结点");
            }else if(cmp<0){
                parent=current;
                current=current.left;
            }else{
                parent=current;
                current=current.right;
            }
        }
        Node node=new Node(key);
        if(cmp<0){
            parent.left=node;
        }else{
            parent.right=node;
        }
    }

    //删除
    public boolean remove(Integer key){
        Node parent=null;
        Node current=root;

        int cmp=0;
        while(current!=null){
            cmp=key.compareTo(current.key);
            if(cmp==0){
                removeInternal(current,parent);
                return true;
            }else if(cmp<0){
                parent=current;
                current=current.left;
            }else{
                parent=current;
                current=current.right;
            }
        }
        return false;
    }

    private void removeInternal(Node node, Node parent) {
        if(node.left==null&&node.right==null){
            if(node==root){
                root=null;
            }else if(parent.left==node){
                parent.left=null;
            }else{
                parent.right=null;
            }
        }else if(node.left!=null&&node.right==null){
            if(node==root){
                root=node.left;
            }else if(parent.left==node){
                parent.left=node.left;
            }else{
                parent.right=node.left;
            }
        }else if(node.left==null){
            if(node==root){
                root=node.right;
            }else if(parent.left==node){
                parent.left=node.right;
            }else{
                parent.right=node.right;
            }
        }else{
            Node ghostParent=node;
            Node ghost=node.left;

            while(ghost.right!=null){
                ghostParent=ghost;
                ghost=ghost.right;
            }

            node.key=ghost.key;
            if(node==ghostParent){
                ghostParent.left = ghost.left;
            }else{
                ghostParent.right=ghost.left;
            }
        }
    }
}
