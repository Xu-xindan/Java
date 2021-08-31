package test0829;

import java.util.Arrays;
import java.util.Scanner;

public class teacherHelpMe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int[] scores=new int[n];
        for (int i = 0; i < n; i++) {
            scores[i]=sc.nextInt();
        }
        Arrays.sort(scores);
        int res=0;
        int[] nor=new int[n];
        nor[n-1]=100;
        int tar=100;
        for (int i = n-2; i >=0 ; i--) {
            if(scores[i]<scores[i+1]){
                tar--;
            }
            nor[i]=tar;
        }
        for(int i=0;i<n;i++){
            if((p*nor[i]+q*scores[i])>=6000){
                res++;
            }
        }
        System.out.println(res);
    }
}
