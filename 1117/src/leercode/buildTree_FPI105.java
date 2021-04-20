package leercode;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/17
 * TIME:13:57
 */
//根据二叉树前序后序构建二叉树
//分步切割
public class buildTree_FPI105 {
    private List<Integer> intArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int e : array) {
            list.add(e);
        }
        return list;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = intArrayToList(preorder);
        List<Integer> inorderList = intArrayToList(inorder);

        return buildTreeInternal(preorderList, inorderList);
    }

    private TreeNode buildTreeInternal(List<Integer> preorderList, List<Integer> inorderList) {
        if (preorderList.isEmpty()) {
            return null;
        }
        int rootVal = preorderList.get(0);
        TreeNode root=new TreeNode(rootVal);
        if (preorderList.size() == 1) {
            return root;
        }
        int leftSize = inorderList.indexOf(rootVal);
        List<Integer> leftPre = preorderList.subList(1, 1 + leftSize);
        List<Integer> rightPre = preorderList.subList(1 + leftSize, preorderList.size());
        List<Integer> leftIn=inorderList.subList(0,leftSize);
        List<Integer> rightIn=inorderList.subList(leftSize+1,inorderList.size());

        root.left=buildTreeInternal(leftPre,leftIn);
        root.right=buildTreeInternal(rightPre,rightIn);
        return root;
    }
}
