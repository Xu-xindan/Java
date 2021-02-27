package arraylist;

import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/16
 * TIME:19:24
 */
public class ArrayListCapacityDemo {
    public static void main(String[] args) {
        //顺序表初始容量是100
        //目前包含元素个数是0个
        List<String> list=new ArrayList<>(100);
        list.set(98,"hello");
    }
}
