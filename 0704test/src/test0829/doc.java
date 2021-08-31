package test0829;

import java.util.Scanner;

public class doc {
    public static void main(String[] args) {
        System.out.println(waste());
    }
    public static int waste(){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String a=sc.next();
        for (int i=0;i<a.length();i++){
            if(!s.contains(a.substring(i,i+1))){
                return -1;
            }
        }
        int res=0;
        String l="";
        for (int i = 0; i <a.length() ; i++) {
            l+=s;
        }
        int j=0;
        for (int i = 0; i <l.length()&&j<a.length() ; i++) {
            if(l.charAt(i)!=a.charAt(j)){
                res++;
            }else{
                j++;
            }
        }
        return res;
    }
}

