/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/22
 * TIME:12:40
 */
public class selectSort {
    //1.遍历选出无序数组中的最大数 记下它的下标
    //2.把它放到最后变成有序部分
    //3.不断找出最大数往有序部分里放 直到遍历完
    //时间复杂度：O(n^2)
    //空间复杂度：O(1)
    public static void selectSort(long[] array){
        int maxIndex=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[maxIndex]){
                    maxIndex=j;
                }
            }
            long t=array[maxIndex];
            array[maxIndex]=array[array.length-i-1];
            array[array.length-i-1]=array[maxIndex];
        }
    }
}
