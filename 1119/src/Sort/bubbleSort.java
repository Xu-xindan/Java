package Sort;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/20
 * TIME:19:12
 */
public class bubbleSort {
    //大的数往后走
    //时间复杂度：o(n)/o(n^2)/o(n^2)  空间：o(1)  稳定
    public static void bubbleSort(long[] array){
        for(int i=0;i<array.length-1;i++){
            boolean isSorted=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    long t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                    isSorted=false;
                }
            }
            if(isSorted==true){
                break;
            }
        }
    }
}
