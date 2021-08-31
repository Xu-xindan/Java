package test08;

import java.util.Arrays;
import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] books=new int[n];
        int[] thick=new int[n];
        for (int i = 0; i <n ; i++) {
            books[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            thick[i]=sc.nextInt();
        }
        Arrays.sort(books);
        Arrays.sort(thick);
        int[] com=new int[n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(books[i]<=thick[j]){
                    com[i]++;
                }else{
                    break;
                }
            }
        }
        int res=1;
        for (int i = n-1; i>=0 ; i--) {
            res*=com[i]-(n-1-i);
        }
        System.out.println(res);
    }
}
