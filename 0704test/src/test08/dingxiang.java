package test08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dingxiang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] trees=new int[n];
        for(int i=0;i<n;i++){
            trees[i]=sc.nextInt();
        }
        int res=0;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(!set.contains(trees[i])){
                set.add(trees[i]);
            }
            int k=0;
            for (int j:set
                 ) {
                if(trees[i]>j){
                    k++;
                }
            }
            res+=k;
        }
        System.out.println(res);
    }
}
