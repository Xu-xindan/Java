package newke;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/6
 * TIME:17:13
 */
/*剑指offer9
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。*/
public class multiply {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        for(int i=0;i<A.length;i++){
            int r=1;
            for(int j=0;j<i;j++){
                r=r*A[j];
            }
            for(int j=i+1;j<A.length;j++){
                r*=A[j];
            }
            B[i]=r;
        }
        return B;
    }
}

