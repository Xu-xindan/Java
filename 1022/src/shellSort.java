/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/23
 * TIME:10:19
 */
public class shellSort {
    //1.选定一个间隔，把数组分成几个组
    //2.组内排序
    //3.间隔缩小再排序 直到gap小于等于1
    //时间复杂度：最好 O(n)  最坏 O(n^2)  平均 O(n^1.3)
    //空间复杂度：O(1)
    public static void shellSort(long[] array){
        int gap=array.length/2;
        while(true){
            insertSortGap(array,gap);
            if(gap==1){
                break;
            }
            gap=gap/2;
        }
    }

    private static void insertSortGap(long[] array, int gap) {
        for(int i=gap;i<array.length;i++){
            long key=array[i];
            int j;
            for(j=i-gap;j>=0;j=j-gap){
                if(array[i]<array[j]){
                    array[j+gap]=array[i];
                }else{
                    break;
                }
            }
            array[j+gap]=key;
        }
    }
}
