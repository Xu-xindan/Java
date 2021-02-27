package arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/16
 * TIME:19:04
 */
public class arrayListDemo {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2= Arrays.asList("我","是","中","国","人",
        "我","爱","我","的","祖国"
        );
        List<String> list3=list2;//将list3指向list2目前指向的内容
        List<String> list4=new ArrayList<>(list3);//构造了新的对象
        list3.set(0,"你");
        System.out.println(list2);//你是中国人。。。
        System.out.println(list3);//你是中国人。。。
        System.out.println(list4);//我是中国人。。。
       /* System.out.println(list2);
        List<String> list3=new ArrayList<>(list2);
        System.out.println(list3);*/
    }
}
