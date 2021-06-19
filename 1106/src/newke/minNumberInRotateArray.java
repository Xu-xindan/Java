package newke;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/6
 * TIME:17:39
 */
/*剑指offer6
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
  输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
   NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) {
            return 0;
        }
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]>array[end]){
                start=mid+1;
            }else if(array[mid]<array[end]){
                end=mid;
            }else{
                end--;
            }
        }
        return array[start];
    }
}
