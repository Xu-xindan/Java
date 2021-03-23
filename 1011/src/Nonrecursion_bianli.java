/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/11
 * TIME:11:42
 */
import java.util.*;
//不用递归先序遍历二叉树
public class Nonrecursion_bianli {
    public static void preOrder(TreeNode root){
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode current=root;

        while(!stack.isEmpty()||current!=null){
            while(current!=null){
                System.out.println(current.val);
                stack.push(current);
                current=current.left;
            }
            TreeNode top=stack.pop();
            current=top.right;
        }
    }

    public static void inOrder(TreeNode root){
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode current=root;

        while(!stack.isEmpty()||current!=null){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            TreeNode top=stack.pop();
            System.out.println(current.val);//中序先打印左子树再打印根
            current=top.right;
        }
    }

    public static void lastOrder(TreeNode root){
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode last=null;
        TreeNode current=root;
        TreeNode top=stack.peek();
        while(!stack.isEmpty()||current!=null){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
        }
        if(top.right==null){
            stack.pop();
            last=top;
            System.out.println(top.val);
        }else if(top.right==last){
            stack.pop();
            last=top;
            System.out.println(top.val);
        }else{
            top=current.right;
        }
    }
}
