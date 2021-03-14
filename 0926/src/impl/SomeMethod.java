package impl;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/27
 * TIME:19:12
 */
public class SomeMethod {
    private static int n;
    public static int sumTreeNodeSize(TreeNode root){
        /*int n=0;*/
        preOrder(root);
        return n;
    }

    //结点数
    public static int sumTreeNodeSize2(TreeNode root){
        if(root==null){
            return 0;
        }else {
            int rootNodeSize = 1;
            int leftSubTreeNodeSize = sumTreeNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize2(root.right);
            return rootNodeSize + leftSubTreeNodeSize + rightSubTreeNodeSize;
        }
    }
    private static void preOrder(TreeNode root){
        if(root!=null){
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //叶子节点个数
    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root){
        leafN=0;
        preOrder2(root);
        return leafN;
    }

    public static void preOrder2(TreeNode root){
        if(root!=null){
            if(root.left==null&&root.right==null){
                leafN++;
            }
            preOrder2(root.left);
            preOrder2(root.right);
        }
    }

    public static int sumTreeLeafNodeSize2(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.right==null&&root.left==null){
            //只有一个结点
            return 1;
        }else{
            int leftSubTreeLeafSize=sumTreeLeafNodeSize2(root.right);
            int rightSubTreeLeafSize=sumTreeLeafNodeSize2(root.left);
            return leftSubTreeLeafSize+rightSubTreeLeafSize;
        }
    }

    //第k层的节点数
    public static int sumKLevelNodeSize(TreeNode root,int k){
        if(root==null){
            return 0;
        }else if(k==0){
            return 1;
        }else{
            int leftSubTreeK_1=sumKLevelNodeSize(root.left,k-1);
            int rightSubTreeK_1=sumKLevelNodeSize(root.right,k-1);
            return leftSubTreeK_1+rightSubTreeK_1;
        }
    }
    //给定一棵二叉树 求二叉树的高度
    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;
        }else{
            int leftSubTreeHeight=getHeight(root.left);
            int rightSubTreeHeight=getHeight(root.right);
            return Math.max(leftSubTreeHeight,rightSubTreeHeight)+1;
        }
    }
    //给定一个二叉树，给定v，问是否包含这个v
    public static  boolean contains(TreeNode root,int v){
        if(root==null){
            return false;
        }else{
            boolean leftSubTreeContains=contains(root.left,v);
            if(leftSubTreeContains){
                return true;
            }else{
                boolean rightSubTreeContains=contains(root.right,v);
                if(rightSubTreeContains){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
    public static  boolean contains2(TreeNode root,int v){
        if(root==null){
            return false;
        }
        if(root.value==v){
            return true;
        }
        boolean left=contains2(root.left,v);
        if(left){
            return true;
        }
        return contains2(root.right,v);
    }
}
