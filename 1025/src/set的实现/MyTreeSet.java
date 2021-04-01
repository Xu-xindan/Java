package set的实现;

import sun.reflect.generics.tree.Tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/25
 * TIME:16:53
 */
public class MyTreeSet implements Set<Integer> {
    private TreeNode root;
    private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        Comparable<Integer> comparable=(Comparable<Integer>)o;
        TreeNode current=root;
        while (current!=null){
            int cmp=comparable.compareTo(current.key);
            if(cmp==0){
                return true;
            }else if(cmp<0){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        if(root==null){
            root=new TreeNode(integer);
            size++;
            return true;
        }
        TreeNode parent=null;
        TreeNode current=root;
        int cmp=0;
        while(current!=null){
            cmp=integer.compareTo(current.key);
            if(cmp==0){
                return false;
            }else if(cmp<0){
                parent=current;
                current=current.right;
            }
        }
        if(cmp<0){
            parent.left=new TreeNode(integer);
        }else{
            parent.right=new TreeNode(integer);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        root=null;
        size=0;
    }
}
