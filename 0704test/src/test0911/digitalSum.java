package test0911;

public class digitalSum {
    public int digitsRecursive (int num) {
        // write code here
        int sum=0;
        while(num>9){
            sum+=num%10;
            num/=10;
        }
        sum+=num;
        if(sum>9){
            return digitsRecursive(sum);
        }
        return sum;
    }
}
