package test0907;

import java.util.Scanner;

public class redFlower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        char[][] peo=new char[l+2][w+2];
        for (int i = 1; i < l+1; i++) {
            String s=sc.next();
            for (int j = 1; j < w+1; j++) {
                peo[i][j]=s.charAt(j-1);
            }
        }
        int count=0;
        for (int i = 1; i < l+1; i++) {
            for (int j = 1; j <w+1 ; j++) {
                if(peo[i][j]=='F'){
                    if(peo[i-1][j-1]=='F'||peo[i-1][j]=='F'||peo[i-1][j+1]=='F'
                            ||peo[i][j-1]=='F'||peo[i][j+1]=='F'||
                            peo[i+1][j-1]=='F'||peo[i+1][j]=='F'||peo[i+1][j+1]=='F'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
