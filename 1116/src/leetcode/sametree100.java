package leetcode;

import BinaryTree.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:11:33
 */
public class sametree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.value==q.value&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
