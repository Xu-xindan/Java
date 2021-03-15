package leetcode;
import impl.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/29
 * TIME:19:28
 */
public class qianxuSolution {
    public void preorderPrint(TreeNode root){
        if(root!=null){
            System.out.println(root);
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root!=null){
            list.add(root.value);
            List<Integer> leftSubTreeList=preorderTraversal(root.left);
            list.addAll(leftSubTreeList);
            List<Integer> rightSubTreeList=preorderTraversal(root.right);
            list.addAll(rightSubTreeList);
        }
        return list;
    }
}
