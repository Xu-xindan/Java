package leetcode;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/16
 * TIME:16:49
 */
public class levelorderWithlevel102 {
    static class Nl{
        TreeNode node;
        int level;

        public Nl(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }

        Queue<Nl> queue=new LinkedList<>();
        queue.add(new Nl(root,0));

        while(!queue.isEmpty()){
            Nl nl=queue.remove();
            TreeNode node=nl.node;
            int level=nl.level;
            //每到新的一层新加一个list 同一个level放在同一个list中
            if(level==list.size()){
                list.add(new ArrayList<>());
            }
            List<Integer> innerList=list.get(level);
            //内层list放元素的值
            innerList.add(node.value);
            if(node.left!=null){
                queue.add(new Nl(node.left,level+1));
            }
            if(node.right!=null){
                queue.add(new Nl(node.right,level+1));
            }
        }
        return list;
    }
}
