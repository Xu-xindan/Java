package BinaryTree;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:09:49
 */
public class method {
    //第k层节点个数  递归
    public static int sumKlevelNodeSize(TreeNode root,int k){
        //根结点单独考虑
        if(root==null){
            return 0;
        }else if(k==1){
            return 1;
        }else{
            //对左右子树采用相同的方法
            int leftsumk_1=sumKlevelNodeSize(root.left,k-1);
            int rightsumk_1=sumKlevelNodeSize(root.right,k-1);
            return leftsumk_1+rightsumk_1;
        }
    }
    //给定一棵二叉树 求该树的高度
    public static int getHeight(TreeNode root){
        //根结点单独考虑
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;
        }else{
            //对左右子树采用相同的方法
            int leftheight=getHeight(root.left);
            int rightheight=getHeight(root.right);
            return Math.max(leftheight,rightheight)+1;
        }
    }
    //给定一棵二叉树 问是否包含v
    public static boolean contains(TreeNode root,int v){
        //根结点单独考虑
        if(root==null){
            return false;
        }else if(root.value==v){
            return true;
        }else{
            //对左右子树采用相同的方法
            boolean leftCon=contains(root.left,v);

            if(leftCon){
                return true;
            }else {
                boolean rightCon=contains(root.right,v);
                if(rightCon){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
    //给定一棵二叉树 问是否包含v 包含返回那个结点
    public static TreeNode contains2(TreeNode root,int v){
        if(root==null){
            return null;
        }
        if(root.value==v){
            return root;
        }
        TreeNode leftCon2=contains2(root.left,v);
        if(leftCon2!=null){
            return leftCon2;
        }
        return contains2(root.right,v);
    }
    //给定一棵二叉树 问是否包含某个结点Node
    public static boolean contains3(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        boolean leftCon=contains3(root.left,node);
        if(leftCon){
            return true;
        }
        return contains3(root.right,node);
    }
}
