package test0908;

import java.util.Scanner;

public class changeNull {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)==' '){
            s="%20"+s.substring(1);
        }
        for (int i = 1; i < s.length()-1; i++) {
            if(s.charAt(i)==' '){
                s=s.substring(0,i)+"%20"+s.substring(i+1);
                i=i+3;
            }
        }
        if(s.charAt(s.length()-1)==' '){
            s=s.substring(0,s.length()-1)+"%20";
        }
        System.out.println(s);
    }
}
