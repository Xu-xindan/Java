package newkeoldkey;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/3
 * TIME:15:35
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String 实际输入=scanner.nextLine();
        String 看到输出=scanner.nextLine();
        实际输入=实际输入.toUpperCase();
        看到输出=看到输出.toUpperCase();
        Set<Character> 所有看到的输出字符=new TreeSet<>();
        for(char ch:看到输出.toCharArray()){
            所有看到的输出字符.add(ch);
        }
        Set<Character> 错误字符=new TreeSet<>();
        for(char ch:实际输入.toCharArray()){
            if(!所有看到的输出字符.contains(ch)){
                if(!错误字符.contains(ch)){
                    System.out.print(ch);
                    错误字符.add(ch);
                }
            }
        }
        System.out.println();
    }
}
