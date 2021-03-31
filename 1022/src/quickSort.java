/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/22
 * TIME:08:38
 */
public class quickSort {
    //1.选择第一个数 作为基准
    //2.对其做partition 遍历数组 将比它小的数放在它的左侧 比它大的数放在右侧
    //3.对左右两部分 进行相同的操作 递归
    //时间复杂度: 最好 O(n*log(n)) 平均 O(n*log(n)) 最坏 O(n^2)
    //空间复杂度：最好 O(log(n))  平均 O(log(n)) 最坏 O(n)
    public static void quickSort(long[] array){
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(long[] array, int leftIndex, int rightIndex) {
        if(leftIndex>=rightIndex){
            return;
        }
        int key=partition(array,leftIndex,rightIndex);
        quickSortInternal(array,leftIndex,key-1);
        quickSortInternal(array,key+1,rightIndex);
    }

    private static int partition(long[] array, int lowIndex, int highIndex) {
        long key=array[lowIndex];
        int leftIndex=lowIndex;
        int rightIndex=highIndex;
        while(leftIndex<rightIndex){
            while(leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }//右下标往左走 找到比key小的数停下来
            while (leftIndex<rightIndex&&array[leftIndex]<=key){
                leftIndex++;
            }//左下标往右走 找到比key大的数 停下
            long t=array[leftIndex];
            array[leftIndex]=array[rightIndex];
            array[rightIndex]=t;
            //交换
        }//两下标相遇 跳出循环
        long m=array[leftIndex];
        array[leftIndex]=array[lowIndex];
        array[lowIndex]=m;
        //左下标停下的数与基准数交换
        return leftIndex;
    }
}
