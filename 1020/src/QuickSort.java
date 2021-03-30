/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/20
 * TIME:18:59
 */
public class QuickSort {
    //快速排序 时间复杂度 最好o(n*log(n))  最坏o(n^2)
    //空间复杂度 最好o(log(n))  最坏o(n)    不稳定
    public static void quickSort(long[] array){
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(long[] array, int lowIndex, int highIndex) {
        int size=highIndex-lowIndex+1;
        if (size<=1){
            return;
        }
        //选择一个数 array[lowIndex]
        //执行partition 小的放左
        //keyIndex 经过partition后 选出来的数作为最终下标
        int keyIndex=partition(array,lowIndex,highIndex);
        quickSortInternal(array,lowIndex,keyIndex-1);
        quickSortInternal(array,keyIndex+1,highIndex);
    }

    //选择array【lowindex】作为特殊的数
    //将区间里的每一个数与它作比较 小的放在左边
    private static int partition(long[] array, int lowIndex, int highIndex) {
        return partitionHover(array,lowIndex,highIndex);
    }

    //hover法partition o（n）
    private static int partitionHover(long[] array, int lowIndex, int highIndex) {
        int leftIndex=lowIndex;
        int rightIndex=highIndex;
        long key=array[lowIndex];
        while(leftIndex<rightIndex){
            while(leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }
            while (leftIndex<rightIndex&&array[leftIndex]<=key) {
                leftIndex++;
            }
            swap(array,leftIndex,rightIndex);
        }
        swap(array,lowIndex,leftIndex);
        return leftIndex;
    }

    private static void swap(long[] array, int Index1, int Index2) {
        long t=array[Index1];
        array[Index1]=array[Index2];
        array[Index2]=t;
    }

    //挖坑法
    private static int partition挖坑(long[] array, int lowIndex, int highIndex){
        long key= array[lowIndex];
        int leftIndex=lowIndex;
        int rightIndex=highIndex;
        while(leftIndex<rightIndex){
            while(leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }
            array[leftIndex]=array[rightIndex];
            while (leftIndex<rightIndex&&array[leftIndex]<=key) {
                leftIndex++;
            }
            array[rightIndex]=array[leftIndex];
        }
        array[leftIndex]=key;
        return leftIndex;
    }

    //前后下标
    private static int partition前后(long[] array, int lowIndex, int highIndex){
        int separateIndex=lowIndex+1;
        for(int i=lowIndex+1;i<=highIndex;i++){
            if(array[i]<array[lowIndex]){
                swap(array,i,separateIndex);
                separateIndex++;
            }
        }
        swap(array,lowIndex,separateIndex-1);
        return separateIndex-1;
    }

    private static void 分割(long[] array){
        int leftIndex=0;
        int rightIndex=array.length-1;
        while(leftIndex<rightIndex){
            while (leftIndex<rightIndex&&array[leftIndex]%2==1){
                leftIndex++;
            }
            while(leftIndex<rightIndex&&array[rightIndex]%2==0){
                rightIndex--;
            }
            swap(array,leftIndex,rightIndex);
        }
    }
}
