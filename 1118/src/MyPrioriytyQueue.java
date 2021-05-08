import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/20
 * TIME:12:12
 */
//堆的应用 优先级队列 小堆 小的优先操作
//优先级队列的实现
public class MyPrioriytyQueue {
    private Integer[] array;
    private int size;

    public MyPrioriytyQueue(){
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
            throw new RuntimeException("空了");
        }
        //把最后一个元素拿到堆顶 向下调整
        int e=array[0];
        array[0]=array[size-1];
        size--;
        adjustDown(0);
        return e;
    }

    private void adjustDown(int index) {
        while(true){
            int leftIndex=2*index+1;
            if(leftIndex>=size){
                return;
            }
            int rightIndex=leftIndex+1;
            int minIndex=leftIndex;
            if(array[rightIndex]<array[leftIndex]&&rightIndex<size){
                minIndex=rightIndex;
            }
            if(array[index]<=array[minIndex]){
                return;
            }
            int t=array[index];
            array[index]=array[minIndex];
            array[minIndex]=t;
            index=minIndex;
        }
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((o1, o2) -> (o2-o1));
        for(int i=0;i<stones.length;i++){
            priorityQueue.add(stones[i]);
        }
        while(priorityQueue.size()>1){
            int y=priorityQueue.poll();
            int x=priorityQueue.poll();
            int dif=y-x;
            if(dif!=0){
                priorityQueue.add(dif);
            }
        }
        if(priorityQueue.size()==0){
            return 0;
        }
        return priorityQueue.peek();
    }
}
