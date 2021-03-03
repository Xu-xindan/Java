package leetcode.design_circular_queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/25
 * TIME:15:05
 */
public class MyCircularQueue {
    private final int[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;
    public MyCircularQueue(int k){
        array=new int[k];
        size=0;
        frontIndex=0;
        rearIndex=0;
    }

    public boolean enQueue(int value){
        if(size==array.length){
            return false;
        }
        array[rearIndex]=value;
        size++;
        rearIndex++;
        if(rearIndex==array.length){
            rearIndex=0;
        }
        return true;
    }

    public boolean deQueue(){
        if(size==0){
            return false;
        }
        size--;
        frontIndex++;
        if(frontIndex==array.length){
            frontIndex=0;
        }
        return true;
    }

    public int Front(){
        if(size==0){
            return -1;
        }
        return array[frontIndex];
    }

    public int Rear(){
        if(size==0){
            return -1;
        }
        int index=rearIndex-1;
        if(index==-1){
            index=array.length-1;
        }
        return array[index];
    }

    public boolean isFull(){
        return size==array.length;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
