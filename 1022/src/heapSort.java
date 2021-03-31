/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/23
 * TIME:09:22
 */
public class heapSort {
    //1.建大堆（最大的数在堆顶）
    //2.把最大的数交换到最后（后面的部分逐渐有序）
    //3.剩下无序部分向下调整
    //4.重复交换 向下调整 直到有序
    //时间复杂度：O(n*log(n))
    //空间复杂度：O(1)
    public static void heapSort(long[] array){
        creatHeap(array,array.length);
        for(int i=0;i<array.length-1;i++){
            long t=array[0];
            array[0]=array[array.length-i-1];
            array[array.length-i-1]=t;
            shiftDown(array,array.length-i-1,0);
        }
    }

    private static void shiftDown(long[] array, int size, int index) {
        while(2*index+1<size){//有左孩子
            int maxIndex=2*index+1;
            if(maxIndex+1<size&&array[maxIndex+1]>array[maxIndex]){
                maxIndex++;
            }//如果左孩子比右孩子小
            if(array[index]>=array[maxIndex]){
                break;
            }//父节点比孩子节点大就不用换
            long t=array[maxIndex];
            array[maxIndex]=array[index];
            array[index]=t;//交换
            index=maxIndex;//继续向下比较
        }

    }

    private static void creatHeap(long[] array, int size) {
        for(int i=(size-2)/2;i>=0;i--){
            shiftDown(array,size,i);
        }//从最后一个有子树的下标开始向下调整 一直到第一个
    }
}
