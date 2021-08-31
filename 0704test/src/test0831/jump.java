package test0831;

import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            System.out.println(jumpFloor(t));
        }
    }
    public static int jumpFloor(int t){
        if(t==1||t==2){
            return t;
        }
        int[] arr=new int[t];
        arr[0]=1;
        arr[1]=2;
        for (int i = 2; i <t ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[t-1];
    }
}

