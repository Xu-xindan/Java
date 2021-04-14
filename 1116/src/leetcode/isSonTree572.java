package leetcode;

import BinaryTree.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:11:54
 */
//给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
//s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
public class isSonTree572 {
    //判断是否为相同树
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //两者皆为空树
        if(p==null&&q==null){
            return true;
        }
        //有一个是空树
        if(p==null||q==null){
            return false;
        }
        //根结点相等并且左右子树也互为相同树
        return p.value==q.value&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        //s为空时
        if(s==null){
            return false;
        }
        //根结点就相等时
        if(s.value==t.value){
            if(isSameTree(s,t)){
                return true;
            }
        }
        //通过对左右子树采用相同的方法  判断左右子树是否有该子树
        if(isSubtree(s.left,t)){
            return true;
        }
        return isSubtree(s.right,t);
    }
}

