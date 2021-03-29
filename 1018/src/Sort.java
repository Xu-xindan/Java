import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/18
 * TIME:15:24
 */
public class Sort {
    //插入排序
    //时间复杂度最好：o(n) 最坏：o(n²) 空间o(1) 稳定
    public static void insertSort(long[] array) {
        for(int i=0;i<array.length-1;i++){
            //有序【0，i+1）
            //无序（i+1，array.length)
            long key=array[i+1];
            int j=i;
            //在有序区间比较
            for(;j>=0;j--){
                if(key<array[j]){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=key;
        }
    }

    //测试四种 随机 有序 倒序 全相等
    public static long[] 构建随机数组(){
        Random random=new Random(20201018);
        long[] array=new long[20];
        for(int i=0;i<20;i++){
            array[i]=random.nextInt(100);
        }
        return array;
    }

    public static long[] 构建完全有序数组(){
        long[] array=构建完全有序数组();
        Arrays.sort(array);
        return array;
    }

    private static void swap(long[] array,int i,int j){
        long t=array[i];
        array[i]=array[j];
        array[j]=t;
    }

    //冒泡排序 时间复杂度最好o(n) 最坏：o(n²) 空间o(1) 稳定
    public static void bubbleSort(long[] array){
        for(int i=0;i<array.length-1;i++){
            //无序：【0，array.length-i)
            //有序：【array.length-i,array.length）
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    //选择排序 时间复杂度最好：o(n²) 最坏：o(n²) 空间o(1) 不稳定
    public static void selectSort(long[] array){
        int max=0;//最大数的下标
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[max]<array[j]){
                    max=j;
                }
            }
            long t=array[max];
            array[max]=array[array.length-i-1];
            array[array.length-i-1]=t;
        }
    }
    //堆排序 时间复杂度o(n*log(n)) 空间o(1) 不稳定
    public static void heapSort(long[] array){
        //1建大堆
        creatHeap(array,array.length);
        //2进行选择的过程
        for(int i=0;i<array.length-1;i++){
            swap(array,0,array.length-1-i);
            shiftDown(array,array.length-1-i,0);
        }
    }
    //向下调整
    public static void shiftDown(long[] array,int size,int index){
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
            long t=array[index];
            array[index]=array[minIndex];
            array[minIndex]=t;

            index=minIndex;
        }
    }
    //建堆
    //最坏时间复杂度nlogn
    public static void creatHeap(long[] array,int size){
        int lastIndex=size-1;
        int laseRarentIndex=(lastIndex-1)/2;
        for(int i=laseRarentIndex;i>=0;i--){
            shiftDown(array,size,i);
        }
    }
    //希尔排序 时间复杂度 最坏o(n^2) 最好o(n) 平均o(n^1.3) 空间o(1) 不稳定
    public static void insertSortGap(long[] array,int gap){
        for(int i=0;i<array.length-1;i++){
            long key=array[i+1];
            int j;
            for(j=i-gap;j>=0;j=j-gap){
                if(key<array[j]){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=key;
        }
    }
    public static void shellSort(long[] array){
        int gap = array.length / 2;

        while (true) {
            insertSortGap(array, gap);
            if (gap == 1) {
                break;
            }
            gap = gap / 2;
        }
    }

    public static int weishu(long n){
        int r=1;
        if(n>10){
            n=n/10;
            r++;
        }
        return r;
    }
    public static int[] 转换(long n){
        int r=weishu(n);
        int[] array=new int[r];

        for(int i=0;i<r;i++){
            array[i]=(int)n%10;
            n=n/10;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(转换(20200201)));
    }
}
