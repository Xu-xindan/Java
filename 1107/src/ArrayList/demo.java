package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/7
 * TIME:11:01
 */
public class demo {
    public static void main(String[] args) {
        //构造了一个空的顺序表
        List<String>  list1=new ArrayList<>();
        List<String> list2= Arrays.asList("我","是","中","国","人");
        System.out.println(list2);
        //ArrayList(Collection<E> c)
        //构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序
        List<String> list3=new ArrayList<>(list2);
        System.out.println(list3);//完全复制list2
    }
}
