/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/22
 * TIME:12:23
 */
public class bubbleSort {
    //1.在无序区间中相邻数比较 大数往后走 一次遍历找到一个最大的放在最后
    //2.一直遍历比较 直到数组有序
    //时间复杂度：最好 O(n) 最坏 O(n^2) 平均 O(n^2)
    //空间复杂度：O(1)
    public static void bubbleSort(long[] array){
        for(int i=0;i<array.length;i++){
            boolean isSorted=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    long t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}

