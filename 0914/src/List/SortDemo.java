package List;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/16
 * TIME:16:12
 */
public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(9);
        list.add(10);
        list.add(1);
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
    }
}
