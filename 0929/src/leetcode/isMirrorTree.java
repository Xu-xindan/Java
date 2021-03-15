package leetcode;

import impl.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/29
 * TIME:20:03
 */
public class isMirrorTree {
    //两棵树是否镜像对称
    boolean isMirrorTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.value==q.value
                &&isMirrorTree(p.left,q.right)
                &&isMirrorTree(p.right,q.left);
    }
    //一棵树是否镜像对称
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isMirrorTree(root.left,root.right);
    }
}
