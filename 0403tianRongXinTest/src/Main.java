
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for(int j=i;j<9-i;j++){
                if(arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[9]);
        System.out.print("]");
    }
}
