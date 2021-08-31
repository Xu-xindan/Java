package test0829;

import java.util.Scanner;

public class longestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int Max=0;
        int MaxIndex=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                int count=1;
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(j)>='0'&&str.charAt(j)<='9'){
                        count++;
                    }else{
                        break;
                    }
                }
                Max=Math.max(Max,count);
                MaxIndex=Max==count?i:MaxIndex;
            }
        }
        String res=str.substring(MaxIndex,MaxIndex+Max);
        System.out.println(res);
    }
}
