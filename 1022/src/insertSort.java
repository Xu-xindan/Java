/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/22
 * TIME:11:53
 */
public class insertSort {
    //1.从无序区间拿出一个数
    //2。与有序区间上的数比较
    //3.插入合适的位置
    //时间复杂度：最好 O(n) 最坏 O(n^2) 平均 O(n^2)
    //空间复杂度：O(1)
    public static void insertSort(long[] array){
        for(int i=0;i<array.length;i++){
            long key=array[i+1];
            for(int j=i;j>=0;j--){
                if(key<array[j]){
                    array[j+1]=array[j];
                }else{
                    break;
                }
                array[j+1]=key;
            }
        }
    }
}
