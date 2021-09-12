package test0912;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer>[] sets=new Set[n];
        for(int i=0;i<n;i++){
            int start=sc.nextInt();
            int len=sc.nextInt();
            for(int j=start;j<start+len;j++){
                sets[i].add(j);
            }
        }
        int max=0;
        for(int i=0;i<100;i++){
            int count=0;
            for(int j=0;j<n;i++){
                if(sets[i].contains(i)){
                    count++;
                }
            }
            max=max>count?max:count;
        }
        System.out.println(max);
    }
}
