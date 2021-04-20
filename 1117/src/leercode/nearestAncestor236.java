package leercode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/17
 * TIME:14:51
 */
//给定一个二叉树, 找到该树中两个指定节点的最近公共祖先
public class nearestAncestor236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //根结点单独考虑
        if(p==root||q==root){
            return root;
        }
        //对左右子树采用相同的方法
        boolean pInleft=search(root.left,p);
        boolean qInleft=search(root.left,q);

        //两个结点都在左子树
        if(pInleft&&qInleft){
            return lowestCommonAncestor(root.left,p,q);
        }
        //两个结点都在右子树
        else if(!pInleft&&!qInleft){
            return lowestCommonAncestor(root.right,p,q);
        }

        //一个在左 一个在右 最近祖先为根结点
        else{
            return root;
        }

    }

    //单独写一个方法判断结点在左子树还是右子树 即判断以root为跟的子树里是否有t结点
   private boolean search(TreeNode root, TreeNode t) {
        //根为空
        if(root==null){
            return false;
        }
        //跟结点就是
        if(root==t){
            return true;
        }
        //对左右子树采用相同的方法
        return search(root.left,t)||search(root.right,t);
    }
}
