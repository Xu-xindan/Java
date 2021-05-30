package leetcode;



import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:11:05
 */
//前序遍历 返回list
public class preorder144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root!=null){
            list.add(root.value);

            List<Integer> leftlist=preorderTraversal(root.left);
            list.addAll(leftlist);

            List<Integer> rightlist=preorderTraversal(root.right);
            list.addAll(rightlist);
        }
        return list;
    }
}
