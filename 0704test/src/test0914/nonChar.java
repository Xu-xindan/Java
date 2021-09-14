package test0914;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class nonChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            System.out.println(findFirstUniqueChar(s));
        }
    }

    public static int findFirstUniqueChar(String s){
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            if(!map.containsKey(a)){
                map.put(a,1);
            }else{
                map.put(a,map.get(a)+1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
