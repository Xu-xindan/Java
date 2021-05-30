package leetcode;

import BinaryTree.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:11:43
 */
//给定一个二叉树，检查它是否是镜像对称的
//左右子树互为镜像即可
public class symmetric101 {
    public static boolean isMirrorTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.value==q.value&&isMirrorTree(p.right,q.left)&&isMirrorTree(p.left,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirrorTree(root.left,root.right);
    }
}

