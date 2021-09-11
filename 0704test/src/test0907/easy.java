package test0907;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Map<Character,Integer> map=new HashMap<>();
        map.put('e',0);
        map.put('a',0);
        map.put('s',0);
        map.put('y',0);
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='E'||s.charAt(i)=='e'){
                map.put('e',map.get('e')+1);
            }else if(s.charAt(i)=='A'||s.charAt(i)=='a'){
                map.put('a',map.get('a')+1);
            }else if(s.charAt(i)=='S'||s.charAt(i)=='s'){
                map.put('s',map.get('s')+1);
            }else if(s.charAt(i)=='Y'||s.charAt(i)=='y'){
                map.put('y',map.get('y')+1);
            }
            if(map.get('y')>map.get('s')&&map.get('s')>map.get('a')&&map.get('a')>map.get('e')){
                count++;
            }
        }
        System.out.println(count);
    }
}
