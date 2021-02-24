package List;
import java.util.List;
import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/14
 * TIME:20:22
 */
public class SubListDemo {
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);//ABCDEF
        List<Character> subList=list.subList(1,4);
        System.out.println(subList);//BCD 左闭右开 不会影响原线性表
        System.out.println(list);//ABCDEF
    }
}
