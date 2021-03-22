package nowcoder;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/9
 * TIME:21:30
 */
class TreeNode{
    char val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(char val){
        this.val=val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}
public class main {
    public static TreeNode buildTree(List<Character> in, List<Character> out){
        if(in.isEmpty()){
            return null;
        }
        char rootVal=in.remove(0);
        if(rootVal=='#'){
            out.addAll(in);
            return null;
        }
        TreeNode root=new TreeNode(rootVal);
        List<Character> rightOut=new ArrayList<>();
        TreeNode left=buildTree(in,rightOut);
        TreeNode right=buildTree(rightOut,out);
        root.left=left;
        root.right=right;
        return root;
    }

    public static List<Character> stringToListChar(String s){
        List<Character> list=new ArrayList<>();
        char[] chars =s.toCharArray();
        for(char ch:chars){
            list.add(ch);
        }
        return list;
    }

    public static void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.printf("%c",root.val);
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        List<Character> in=stringToListChar(s);
        ArrayList<Character> out=new ArrayList<>();
        TreeNode root=buildTree(in,out);
        inOrder(root);
        /*List<Character> in= new ArrayList<>(Arrays.asList(
                'a','b','c','#','#','d','e','#','g','#','#','f','#','#','#'
        ));
        List<Character> out=new ArrayList<>();
        TreeNode root=buildTree();*/
    }
}
