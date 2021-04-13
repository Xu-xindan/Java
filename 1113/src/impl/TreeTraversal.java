package impl;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/13
 * TIME:20:01
 */
public class TreeTraversal {
    //前序遍历
    public static void preTraversal(Node root){
        if(root!=null) {
            System.out.printf("%c",root.val);
            preTraversal(root.left);
            preTraversal(root.right);
        }else{
            //不处理
        }
    }

    //中序遍历
    public static void inTraversal(Node root){
        if(root!=null){
            inTraversal(root.left);
            System.out.printf("%c",root.val);
            inTraversal(root.right);
        }else{}
    }

    //后序遍历
    public static void postTraversal(Node root){
        if(root!=null){
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.printf("%c",root.val);
        }else{}
    }
}
