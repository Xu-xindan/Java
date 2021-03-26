/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/14
 * TIME:19:52
 */
public class heap {
    //向下调整
    //1.判断index对应的下标是不是叶子节点（比较size和index的关系）
    //2.找到两个孩子中最小的（一定有左孩子）（判断有无右孩子）（比较左右孩子大小）
    //3.交换 循环
    //最坏时间复杂度logn
    public static void shiftDown(int[] array,int size,int index){
        while(true){
            //1
            int leftIndex=2*index+1;
            if(leftIndex>=size){
                return;
            }
            //2
            int minIndex=leftIndex;
            int rightIndex=leftIndex+1;
            if(rightIndex<size&&array[rightIndex]<array[leftIndex]){
                minIndex=rightIndex;
            }
            if(array[index]<=array[minIndex]){
                return;
            }
            //3
            int t=array[index];
            array[index]=array[minIndex];
            array[minIndex]=t;

            index=minIndex;
        }
    }
    //建堆
    //最坏时间复杂度nlogn
    public static void creatHeap(int[] array,int size){
        int lastIndex=size-1;
        int laseRarentIndex=(lastIndex-1)/2;
        for(int i=laseRarentIndex;i>=0;i--){
            shiftDown(array,size,i);
        }
    }
}
