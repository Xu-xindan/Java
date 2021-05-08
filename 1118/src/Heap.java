/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/19
 * TIME:12:18
 */
public class Heap {
    //向下调整  时间复杂度log(n)
    public static void adjustDown(int[] array,int size,int index){
        while(true) {
            //1.判断index是不是叶子
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                return;
            }

            //2.找最小孩子
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }

            //3.比较最小孩子的值和index位置的值
            if (array[minIndex] >= array[index]) {
                return;
            }

            //4.swap
            int t = array[minIndex];
            array[minIndex] = array[index];
            array[index] = t;

            //把最小孩子视为index继续循环
            index = minIndex;
        }
    }

    //建堆 o(n*log(n))
    public static void createHeap(int[] array,int size){
        //数组最后一个下标
        int lastIndex=size-1;
        //最后一个下标的父节点
        int lastparentIndex=(lastIndex-1)/2;
        //不断进行向下调整
        for(int i=lastparentIndex;i>=0;i--){
            adjustDown(array,size,i);
        }
    }

    //向上调整
    public static void adjustUp(int[] array,int size,int index){
        while(index!=0){
            int parentIndex=(index-1)/2;
            //父节点和该结点比较
            if(array[parentIndex]>=array[index]){
                break;
            }
            int t=array[index];
            array[index]=array[parentIndex];
            array[parentIndex]=t;
            index=parentIndex;
        }
    }
}
