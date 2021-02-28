package int_type.generic_type;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/20
 * TIME:09:24
 */
public class MyArrayList<E> implements List<E> {
    private E[] array;
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
        return indexOf(o)!=-1;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] a=new Object[size];
        for(int i=0;i<size;i++){
            a[i]=array[i];
        }
        return a;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if(a.length<size){
            T[] newArray=(T[])new Object[size];
            for(int i=0;i<size;i++){
                newArray[i]=(T) array[i];
            }
            return newArray;
        }else if(a.length==size){
            for(int i=0;i<size;i++){
                a[i]=(T)array[i];
            }
            return a;
        }else{
            for(int i=0;i<size;i++){
                a[i]=(T)array[i];
            }
            a[size]=null;
            return a;
        }
    }

    @Override
    public boolean add(E e) {
        return false;
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
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(array,null);
        size=0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for(int i=0;i<size;i++){
            if(o==null){
                if(array[i]==o){
                    return i;
                }
            }else{
                if(o.equals(array[i])){
                    return i;
                }
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
