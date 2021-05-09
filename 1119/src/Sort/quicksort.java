package Sort;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/21
 * TIME:11:17
 */
//partition+对左右采取相同的操作 直到区间只剩0/1个
public class quicksort {
    public static void quickSort(long[] array){
        quickSortInternal(array,0,array.length);
    }

    private static void quickSortInternal(long[] array, int lowIndex, int highIndex) {
        int size=highIndex-lowIndex+1;
        if(size<=1){
            return;
        }
        int keyIndex=partition(array,lowIndex,highIndex);
        quickSortInternal(array,lowIndex,keyIndex-1);
        quickSortInternal(array,keyIndex+1,highIndex);
    }

    //小的在左 大的在右
    private static int partition(long[] array, int lowIndex, int highIndex) {
        int leftIndex=lowIndex;
        int rightIndex=highIndex;
        //选择左边的数为基准
        long key=array[leftIndex];
        while (leftIndex<rightIndex){
            //右边先走
            while(leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }
            while(leftIndex<rightIndex&&array[leftIndex]<=key){
                leftIndex++;
            }
            swap(array,leftIndex,rightIndex);
        }
        swap(array,lowIndex,leftIndex);
        return leftIndex;
    }

    private static void swap(long[] array, int index1, int index2) {
        long t=array[index1];
        array[index1]=array[index2];
        array[index2]=t;
    }
}

