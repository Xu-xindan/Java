import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/18
 * TIME:14:45
 */
public class sixteen_ten {
    public static long pow(int n,int p){
        int a=1;
        for(int i=0;i<p;i++){
            a=a*n;
        }
            return a;
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String hexString=scanner.nextLine();
        long n=hexTo16(hexString);
        System.out.println(n);

        /*long n=10*pow(16,5)+11*pow(16,4)+12*pow(16,3)+13*pow(16,2)+14*pow(16,1)+15*1;
        System.out.printf("%15d\n",n);*/
    }
    private static long hexTo16(String hexString){
        long r=0;
        char[] chars=hexString.toCharArray();
        for(char c:chars){
            int digit=字符转数字(c);
            r=(r+digit)*16;
        }
        return r/16;
    }
    public static int 字符转数字(char c){
        if(c>='0'&&c<='9'){
            return c-'0';
        }else{
            return c-'A'+10;
        }
    }

}
