/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/22
 * TIME:09:44
 */
public class mergeSort {
    //1.把数组分成两部分 不断划分 进行相同的操作 直到区间只剩下一个数 必然有序
    //2.将有序的区间合并 递归
    //时间复杂度：O(n*log(n))
    //空间复杂度：O(n)
    //稳定
    public static void mergeSort(long[] array){
        mergeSortInternal(array,0,array.length);
    }

    private static void mergeSortInternal(long[] array, int lowIndex, int highIndex) {
        int size=highIndex-lowIndex;
        if(size<=1){
            return ;
        }
        int middleIndex=(highIndex+lowIndex)/2;
        mergeSortInternal(array,lowIndex,middleIndex);
        mergeSortInternal(array,middleIndex,highIndex);
        merge(array,lowIndex,middleIndex,highIndex);
    }

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
        if(leftIndex<middleIndex) {
            while (leftIndex < middleIndex) {
                extraArray[extraIndex++] = array[leftIndex++];
            }
        }else{
            while(rightIndex<highIndex){
                extraArray[extraIndex++]=array[rightIndex++];
            }
        }
        for(int i=0;i<size;i++){
            array[lowIndex+i]=extraArray[i];
        }
    }
}
