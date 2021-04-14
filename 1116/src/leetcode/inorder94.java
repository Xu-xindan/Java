package leetcode;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:11:20
 */
public class inorder94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root!=null){
            List<Integer> leftlist=inorderTraversal(root.left);
            list.addAll(leftlist);

            list.add(root.value);

            List<Integer> rightlist=inorderTraversal(root.right);
            list.addAll(rightlist);
        }
        return list;
    }
}
