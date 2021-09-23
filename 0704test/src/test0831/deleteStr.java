package test0831;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class deleteStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res=delString(s);
        while(!s.equals(res)){
            s=res;
            res=delString(res);
        }
        System.out.println(res);
    }

    public static String delString(String A){
        int i=0;
        //Map<Integer,Integer> map=new HashMap<>();
        while(i < A.length()-2) {
            if(A.charAt(i)==A.charAt(i+1)&&A.charAt(i)==A.charAt(i+2)){
                int k=3;
                for (int j = i+3; j < A.length(); j++) {
                    if(A.charAt(j)==A.charAt(i)){
                        k++;
                    }else{
                        break;
                    }
                }
                A=A.substring(0,i)+A.substring(i+k);
            }
            i++;
        }
        return A;
    }
}
