package binary_search_tree;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/25
 * TIME:10:50
 */
public class BST {
    private Node root;
    public BST(){
        root=null;
    }

    //查找二叉搜索树中是否存在key
    public boolean search(Integer key){
        Node current=root;
        while(current!=null){
            int cmp=key.compareTo(current.key);
            if(cmp==0){
                return true;
            }else if(cmp<0){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return false;
    }

    //插入值为key的节点
    public void insert(Integer key){
        if(root==null){
            root=new Node(key);
            return;
        }
        int cmp=0;
        Node parent=null;
        Node current=root;
        while(current!=null){
            cmp=key.compareTo(current.key);
            if(cmp==0){
                throw new RuntimeException("BST中不允许出现相同的key");
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

    //删除结点
    public boolean remove(Integer key){
        //1.查找要删除的节点
        Node parent=null;
        Node current=root;
        while(current!=null){
            int cmp=key.compareTo(current.key);
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
        if(node.right==null&&node.left==null){
            if(node==root){
                root=null;
            }else if(parent.left==node){
                parent.left=null;
            }else{
                parent.right=null;
            }
        }else if(node.right!=null&&node.left==null){
            if(node==root){
                root=node.right;
            }else if(node==parent.right){
                parent.right=node.right;
            }else{
                parent.left=node.right;
            }
        }else if(node.right==null&&node.left!=null){
            if(node==root){
                root=node.left;
            }else if(node==parent.right){
                parent.right=node.left;
            }else{
                parent.left=node.left;
            }
        }else{
            //左右都不为空 替换法 找到左子树的最大值 替换结点的值 删除结点
            Node gohstParent=node;
            Node ghost=node.left;
            while(ghost.right!=null){
                gohstParent=ghost;
                ghost=ghost.right;
            }
            node.key=ghost.key;
            if(node==gohstParent){
                gohstParent.left=ghost.left;
            }else{
                gohstParent.right=ghost.left;
            }
        }
    }
}
