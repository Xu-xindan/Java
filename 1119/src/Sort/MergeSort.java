package Sort;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/21
 * TIME:13:24
 */
//归并排序
public class MergeSort {
    public static void mergrSort(long[] array){
        mergrSortInternal(array,0,array.length);
    }

    //分组进行相同的操作
    private static void mergrSortInternal(long[] array, int lowIndex, int highIndex) {
        int size=highIndex-lowIndex;
        if(size<=1){
            return;
        }
        int middleIndex=(lowIndex+highIndex)/2;
        mergrSortInternal(array,lowIndex,middleIndex);
        mergrSortInternal(array,middleIndex,highIndex);

        merge(array,lowIndex,middleIndex,highIndex);
    }

    //合并
    private static void merge(long[] array, int lowIndex, int middleIndex, int highIndex) {
        int size=highIndex-lowIndex;
        long[] extraArray=new long[size];

        int leftIndex=lowIndex;
        int rightIndex=middleIndex;
        int extraIndex=0;

        while(leftIndex<middleIndex&&rightIndex<highIndex){
            if(array[leftIndex]<=array[rightIndex]){
                extraArray[extraIndex++]=array[leftIndex++];
            }else{
                extraArray[extraIndex++]=array[rightIndex++];
            }
        }

        if(leftIndex<middleIndex){
            while(leftIndex<middleIndex) {
                extraArray[extraIndex++] = array[leftIndex++];
            }
        }else{
            while(rightIndex<highIndex){
                extraArray[extraIndex++]=array[rightIndex++];
            }
        }

        for(int i=lowIndex;i<highIndex;i++){
            array[i]=extraArray[i-lowIndex];
        }
    }
}
