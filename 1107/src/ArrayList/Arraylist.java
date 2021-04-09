package ArrayList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/7
 * TIME:12:41
 */
public class Arraylist implements List{
    private int[] array;
    private int size;

    public Arraylist(){
        array=new int[10];
        size=0;
    }

    public Arraylist(List other){

    }

    //扩容
    public void ensurCapacity(int capacity){
        //0.检查是否需要扩容
        if(array.length>=capacity){
            return;
        }
        //1.定义新数组
        int[] newArray=new int[capacity];
        //2.搬家 从array到newarray
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        //3.不再关联老的array
        array=newArray;
    }

    //平时时间复杂度o(1)  扩容o(n)
    @Override
    public boolean add(Integer e) {
        //扩容
        if(array.length==size){
            ensurCapacity(array.length*2);
        }
        array[size++]=e;
        return true;
    }

    @Override
    public void add(int index, Integer e) {
        //扩容
        if(array.length==size){
            ensurCapacity(array.length*2);
        }
        //合法性检验 插入【0，size】
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("不合法下标"+index);
        }
        for(int i=size-1;i>=index;i--){
            array[i+1]=array[i];
        }
        array[index]=e;
        size++;
    }

    @Override
    public int remove(int index) {
        //合法性检验 其他【0，size-1】
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("不合法下标"+index);
        }

        int e=array[index];
        for(int i=index+1;i<size;i++){
            array[i-1]=array[i];
        }
        return e;
    }

    @Override
    public boolean remove(Integer element) {
        if(indexOf(element)>=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Integer set(int index, Integer e) {
        //合法性检验
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("不合法下标"+index);
        }

        Integer old=array[index];
        array[index]=e;
        return old;
    }

    @Override
    public Integer get(int index) {
        //合法性检验
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("不合法下标"+index);
        }

        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for(int i=0;i<size;i++){
            set(i,-1);
        }
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Integer e) {
        if(indexOf(e)>=0){
            return true;
        }
        return false;
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
    public int lastIndexOf(Integer e) {
        for(int i=size;i>0;i--){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }
}
