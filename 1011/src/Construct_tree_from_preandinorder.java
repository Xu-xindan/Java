/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/11
 * TIME:10:19
 */
import java.util.*;
//已知前序中序求树
public class Construct_tree_from_preandinorder {
    private List<Integer> intArrayToList(int[] array){
        List<Integer> list=new ArrayList<>();
        for(int e:array){
            list.add(e);
        }
        return list;
    }

    private TreeNode buildTreeInternal(List<Integer> preorderList,List<Integer> inorderList){
        if(preorderList.isEmpty()){
            return null;
        }
        int rootVal=preorderList.get(0);
        TreeNode root=new TreeNode(rootVal);
        if(preorderList.size()==1){
            return root;
        }
        int leftSize=inorderList.indexOf(rootVal);
        List<Integer> leftPre=preorderList.subList(1,1+leftSize);
        List<Integer> rightPre=preorderList.subList(1+leftSize,preorderList.size());
        List<Integer> leftIn=preorderList.subList(0,leftSize);
        List<Integer> rightIn=preorderList.subList(leftSize+1,inorderList.size());
        root.left=buildTreeInternal(leftPre,leftIn);
        root.right=buildTreeInternal(rightPre,rightIn);
        return root;
    }

    public TreeNode buildTree(int[] preorder,int[] inorder){
        List<Integer> preorderList=intArrayToList(preorder);
        List<Integer> inorderList=intArrayToList(inorder);
        return buildTreeInternal(preorderList,inorderList);
    }
}
