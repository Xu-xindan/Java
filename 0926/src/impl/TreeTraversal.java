package impl;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/26
 * TIME:11:07
 */
public class TreeTraversal {
    public static void preTraversal(TreeNode root){
        if(root!=null) {
            //处理根节点
            System.out.printf("%c",root.value);
            //按照谦虚的方式，递归处理左子树
            preTraversal(root.left);
            //处理右子树
            preTraversal(root.right);
        }else{

        }
    }

    public static void inTraversal(TreeNode root){
        if(root!=null){
            inTraversal(root.left);
            System.out.printf("%c",root.value);
            inTraversal(root.right);
        }else{

        }
    }

    public static void postTraversal(TreeNode root){
        if(root!=null){
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.printf("%c",root.value);
        }else{

        }
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode('A');
        TreeNode b=new TreeNode('B');
        TreeNode c=new TreeNode('C');
        TreeNode d=new TreeNode('D');
        TreeNode e=new TreeNode('E');
        TreeNode f=new TreeNode('F');
        TreeNode g=new TreeNode('G');
        TreeNode h=new TreeNode('H');
        TreeNode i=new TreeNode('I');
        TreeNode j=new TreeNode('J');

        a.left=b;
        a.right=c;

        b.left=d;

        c.left=e;
        c.right=f;

        d.right=g;

        g.left=j;

        f.left=h;
        f.right=i;

        preTraversal(a);
    }
}
