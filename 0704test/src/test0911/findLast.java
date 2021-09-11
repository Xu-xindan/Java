package test0911;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findLast {
    public int solution1 (int[] source) {
        // write code here
        Arrays.sort(source);
        if(source[source.length-1]!=source[source.length-2]){
            return source[source.length-1];
        }
        for (int i = source.length-2; i >0 ; i--) {
            if(source[i]!=source[i+1]&&source[i]!=source[i-1]){
                return source[i];
            }
        }
        if(source[1]!=source[0]){
            return source[0];
        }else{
            return -1;
        }
    }

    public static int solution (int[] source){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for (int i = 0; i < source.length; i++) {
            if(!set1.contains(source[i])){
                set1.add(source[i]);
            }else{
                set2.add(source[i]);
            }
        }
        for (int i = source.length-1; i >=0 ; i--) {
            if(!set2.contains(source[i])){
                return source[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,9,7,7};
        System.out.println(solution(arr));
    }
}
