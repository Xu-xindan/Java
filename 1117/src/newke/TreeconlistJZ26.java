package newke;

import leercode.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/17
 * TIME:16:44
 */
public class TreeconlistJZ26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        head=last=null;
        inOrder(pRootOfTree);
        return head;
    }

    TreeNode head;
    TreeNode last;
    private void add(TreeNode node){
        if(last==null){
            head=node;
        }else{
            last.right=node;
            node.left=last;
        }
        last=node;
    }

    private void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            add(root);
            inOrder(root.right);
        }
    }
}
