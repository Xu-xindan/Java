/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/14
 * TIME:20:50
 */
public class MyPriorityQueue {
    private Integer[] array;
    private int size;

    public MyPriorityQueue(){
        array=new Integer[100];
        size=0;
    }

    public Integer element(){
        if(size==0){
            throw new RuntimeException("空了");
        }
        return array[0];
    }

    public Integer remove(){
        if(size==0){
            throw  new RuntimeException("");
        }
        int e=array[0];
        array[0]=array[size-1];
        size--;
        //shiftDown(0);
        return e;
    }

    public void add(int e){

    }

    public static void adjustUp(int[] array,int size,int index){
        //1.判断index是不是树的根
        //2.找到index的父节点
        //3.比较父节点和index的值
        //4.父节点小于=index的值 调整结束
        //5.交换父节点 index
        //6.把父节点给 index


        while(index!=0){
            //1
            if(index==0){
                break;
            }
            //2
            int parentIndex=(index-1)/2;
            //3 4
            if(array[index]>=array[parentIndex]){
                break;
            }
            //5
            int t=array[index];
            array[index]=array[parentIndex];
            array[parentIndex]=t;
            index=parentIndex;
        }
    }
}
