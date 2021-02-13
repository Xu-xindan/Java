package String;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:11:23
 */
public class TestDemo {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3="hello";
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);
        //true str1的值和str3的值是一样的
        System.out.println(str1.equals(str3));
        //str1这个引用指向的对象和str3这个引用指向的对象，内容是否相同
    }
    public static void main2(String[] args) {
        String str1="hello";
        String str2=str1;
        System.out.println(str2);
        str1="gao";
        System.out.println(str1);
        System.out.println(str2);//不变
    }
    public static void main1(String[] args) {
        String str1="hello";
        String str2=new String("hello");

        char[] value={'a','b','c','d'};
        String str3=new String(value);

    }
}
