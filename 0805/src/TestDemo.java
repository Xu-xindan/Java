import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/5
 * TIME:08:55
 */
public class TestDemo {
    public static String  func(String str){
        String ret="";
        String[] s=str.split(" ");
        for(String ss:s){
            ret+=ss;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ret=func(str);
        System.out.println(ret);
    }
    public static void main8(String[] args) {
        String str="192-168-1-0";
        //-分割
        String[] strings=str.split("-");
        String str2="jkdh sjku whs ws";
        //分割长度
        String[] strings1=str2.split(" ",4);
    }
    public static void main7(String[] args) {
        String str="abcdab";
        //替换所有
        System.out.println(str.replace("ab", "gg"));
        //替换第一个
        System.out.println(str.replaceFirst("ab", "gg"));
    }

    public static void main6(String[] args) {
        String str="abcdef";
        //判断是否存在
        System.out.println(str.contains("cde"));
        //从头开始找返回位置
        System.out.println(str.indexOf("cd"));
        //从指定位置找
        str.indexOf("cd",2);
        //判断是否以 开始
        System.out.println(str.startsWith("ab"));
    }

    public static void main5(String[] args) {
        byte[] bytes={97,98,99,100};
        String str=new String(bytes);
        System.out.println(str);
    }

    public static boolean num(String str){
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            if(data[i]<='9'&&data[i]>='0'){
                return true;
            }
        }
        return false;
    }

    public static void main4(String[] args) {
        String str="1234";
        System.out.println(num(str));
    }

    public static void main3(String[] args) {
        char[] value={'a','b','c','d'};
        String str = new String(value);
        System.out.println(str);
        ;
        //offset count  不能越界
        String str2=new String(value,1,2);
        System.out.println(str2);//bc

        //字符串-》字符
        String str3="hello";
        char ch=str3.charAt(0);
        System.out.println(ch);//h

        char[] chars=str3.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
    public static void main2(String[] args) {
        String str1="abcdef";
        String str2="abefrd";
        //str1 str2 比较大小
        System.out.println(str1.compareTo(str2));
        //str1 str2 大小是否相等
        System.out.println(str1.equals(str2));
    }
    public static void main1(String[] args) {
        String str1="abcdef";
        String str2="abcdef";
        System.out.println(str1==str2);//true

        String str3=new String("abcdef");
        System.out.println(str1==str3);//false

        String str4="abc"+"def";//编译时就是abcdef
        System.out.println(str1==str4);//true

        String str5="ab"+new String("cdef");
        System.out.println(str1==str5);//false

        String str6="hel";
        //final String str6=="hel";//true
        String str7=str6+"lo";
        String str8="hello";
        System.out.println(str7==str8);//false
    }
}
