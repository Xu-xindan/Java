package leetcode;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:11:24
 */
public class postorder145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root!=null){
            List<Integer> leftlist=postorderTraversal(root.left);
            list.addAll(leftlist);

            List<Integer> rightlist=postorderTraversal(root.right);
            list.addAll(rightlist);

            list.add(root.value);
        }
        return list;
    }
}
