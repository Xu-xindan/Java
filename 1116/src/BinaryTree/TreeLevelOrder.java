package BinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:15:41
 */

public class TreeLevelOrder {
    //二叉树的层序遍历
    public static void TreeLevelTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        //把根放入队列中
        queue.add(root);
        while(!(queue.isEmpty())){
            //把队首元素取出并打印
            TreeNode node=queue.remove();
            System.out.println(node.value);
            //把它的左右孩子（如果有放入队列中）
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

    //判断是否为完全二叉树
    public static boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(true){
            //取出队首元素
            TreeNode node=queue.remove();
            //队首为空就结束
            if(node==null){
                break;
            }
            //队首不为空 把结点左右孩子均放入队中 无论是否有
            queue.add(node.left);
            queue.add(node.right);
        }

        //前一个循环跳出后 检查剩余队列中是否全为空
        while(!queue.isEmpty()){
            TreeNode node=queue.remove();
            if(node!=null){
                return false;
            }
        }
        return true;
    }
}
