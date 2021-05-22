package niuke;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class badboard {
    //旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
    //现在给出应该输入的一段文字 以及实际被输入的文字，请你列出肯定坏掉的那些键。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String 实际输入=sc.nextLine().toUpperCase();
        String 看到输出=sc.nextLine().toUpperCase();

        Set<Character> 看到输出字符=new TreeSet<>();
        for(char chars:看到输出.toCharArray()){
            看到输出字符.add(chars);
        }
        Set<Character> 错误字符=new TreeSet<>();

        for(char ch:实际输入.toCharArray()){
            if(!看到输出字符.contains(ch)){
                if(!错误字符.contains(ch)){
                    System.out.print(ch);
                }
                错误字符.add(ch);
            }
        }
        System.out.println();
    }
}
