package leetcode;

import com.sun.org.apache.xpath.internal.objects.XBoolean;
import impl.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/29
 * TIME:19:49
 */
public class Treeequal {
    //相同树
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.value==q.value
                &&isSameTree(p.left,q.left)
                &&isSameTree(p.right,q.right);
    }
    //判断子树
    public boolean search(TreeNode root,TreeNode t) {
        if (root == null) {
            return false;
        }
        if (root.value == t.value) {
            if (isSameTree(root, t)) {
                return true;
            }
        }
        if(search(root.left,t)){
            return true;
        }
        return search(root.right, t);
    }
        public boolean isSubtree(TreeNode s, TreeNode t){
            return search(s,t);
        }
}
