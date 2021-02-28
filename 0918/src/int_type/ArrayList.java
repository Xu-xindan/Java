package int_type;

import org.omg.PortableInterceptor.INACTIVE;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/18
 * TIME:19:55
 */
public class ArrayList implements List{
    private int[] array;
    private int size;

    public ArrayList(){
        array=new int[10];
        size=0;
    }

    public ArrayList(List other){

    }
    @Override
    public boolean add(Integer e) {
        if(array.length==size){
            ensureCapacity(array.length*2);
        }
        array[size++]=e;
        return false;
    }

    public void ensureCapacity(int capacity){
        if(array.length>=capacity){
            return;
        }
        int[] newArray=new int[capacity];
        for(int i=0;i<size;i++){
            newArray[i]=this.array[i];
        }
        this.array=newArray;
    }
    @Override
    public void add(int index, Integer e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标不合法");
        }
        if(array.length==size){
            ensureCapacity(array.length*2);
        }
        for(int i=size;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=e;
        size++;
    }

    @Override
    public Integer remove(int index) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标不合法");
        }
        int e=array[index];
        for(int i=index+1;i<=size-1;i++){
            array[i-1]=array[i];
        }
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e) {
        int index=indexOf(e);
        if(index!=-1){
            remove(index);
            return true;
        }else{
            return false;
        }
       /* for(int i=0;i<size;i++){
            if(array[i]==0){
                remove(i);
                return true;
            }
        }
        return false;*/
    }

    @Override
    public Integer get(int index) {
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("下标不合法");
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标不合法");
        }
        Integer old=array[index];
        array[index]=e;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        Arrays.fill(array,-1);
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) !=-1;
    }

    @Override
    public int indexOf(Integer e) {
        for(int i=0;i<size;i++){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastindexOf(Integer e) {
        for(int i=size-1;i>=0;i--){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator iterator(){
        return new ArrayListIterator(this);
    }
}
