package impl;

import sun.reflect.generics.tree.Tree;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/29
 * TIME:19:05
 */
public class Search {
    //是否包含值为v的结点
    public static boolean contains1(TreeNode root,int v){
        if(root==null){
            return false;
        }
        if(root.value==v){
            return true;
        }
        boolean leftContains=contains1(root.left,v);
        if(leftContains){
            return true;
        }
        return contains1(root.right,v);
    }
    //找出包含值为v的节点
    public static TreeNode contains2(TreeNode root,int v){
        if(root==null){
            return null;
        }
        if(root.value==v){
            return root;
        }
        TreeNode leftContains=contains2(root.left,v);
        if(leftContains!=null){
            return leftContains;
        }
        return contains2(root.right,v);
    }
    //找结点
    public static boolean contains3(TreeNode root, TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        boolean leftContains=contains3(root.left,node);
        if(leftContains){
            return true;
        }
        return contains3(root.right,node);
    }
}
