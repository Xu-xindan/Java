package newke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:18:24
 */
//牛客清华考研复试 二叉树遍历
//编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树。
//例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
//建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。

class TreeNode{
    char val;
    TreeNode left=null;
    TreeNode right=null;

    TreeNode(char val){
        this.val=val;
    }
}
public class Main {
    //in输入的  out用来放一步一步走的过程中剩下来的 return中序遍历的根节点
    public static TreeNode buildTree(List<Character> in, List<Character> out){
        //空树
        if(in.isEmpty()){
            return null;
        }

        char rootVal=in.remove(0);
        if(rootVal=='#'){
            //剩下的是除去第一个元素的in
            out.addAll(in);
            //遇到#一定是空树
            return null;
        }
        TreeNode root=new TreeNode(rootVal);
        //in已经不包含第一个元素了
        List<Character> rightOut=new ArrayList<>();
        TreeNode left=buildTree(in,rightOut);
        TreeNode right=buildTree(rightOut,out);
        root.left=left;
        root.right=right;
        return root;
    }

    public static List<Character> stringToListChar(String s){
        List<Character> list=new ArrayList<>();
        char[] chars=s.toCharArray();
        for(char ch:chars){
            list.add(ch);
        }
        return list;
    }

    public static void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.printf("%c ",root.val);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<Character> in=stringToListChar(s);
        ArrayList<Character> out=new ArrayList<>();
        TreeNode root=buildTree(in,out);
        inOrder(root);
    }
}
