import sun.reflect.generics.tree.Tree;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/11
 * TIME:11:23
 */
//将一个二叉搜索树转化为排序的双向链表
public class convert {
    private TreeNode head;
    private TreeNode last;

    private void add(TreeNode node){
        TreeNode newNode=new TreeNode(node.val);
        if(last==null){
            head=newNode;
        }else{
            last.right=newNode;
        }
        newNode.left=last;
        last=newNode;
    }

    private void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.left);
            add(node);
            inOrder(node.right);
        }
    }

    public TreeNode Convert(TreeNode pRootOfTree){
        head=last=null;
        inOrder(pRootOfTree);
        return head;
    }
}
