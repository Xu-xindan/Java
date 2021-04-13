package impl;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/13
 * TIME:20:23
 */
public class SomeMethod {
    //记录结点个数 前序遍历++
    private static int n;
    public static int sumNodeSize(Node root){
        n=0;
        preOrder(root);
        return n;
    }

    private static void preOrder(Node root) {
        if(root!=null){
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    public static int sumNodeSize2(Node root){
        if(root==null){
            return 0;
        }else {
            int rootNodeSize = 1;//根结点单独考虑
            //对左右子树采用相同的方法
            int leftNodeSize = sumNodeSize2(root.left);
            int rightNOdeSize = sumNodeSize2(root.right);
            return rootNodeSize + leftNodeSize + rightNOdeSize;
        }
    }

    //计算叶子节点个数
    private static int leafN;
    public static int sumLeafNodeSize(Node root){
        leafN=0;
        preOrder2(root);
        return leafN;
    }

    private static void preOrder2(Node root) {
        if(root!=null){
            if(root.left==null&&root.right==null){
                leafN++;
            }
            preOrder2(root.left);
            preOrder2(root.right);
        }
    }

    public static int sumleafNodeSize2(Node root){
        if(root==null){
            return 0;
        }else if(root.right==null&&root.left==null){
            return 1;
        }else{
            int leftLeafSize=sumleafNodeSize2(root.left);
            int right=sumleafNodeSize2(root.right);
            return leftLeafSize+right;
        }
    }
}
