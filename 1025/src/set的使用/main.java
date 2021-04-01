package set的使用;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/25
 * TIME:16:35
 */
public class main {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        System.out.println(set.add("apple"));
        System.out.println(set.add("peach"));
        System.out.println(set.add("banana"));
        System.out.println(set.add("orange"));
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains("watermelon"));
        System.out.println(set.remove("watermelon"));
        System.out.println(set.remove("apple"));
        System.out.println(set.isEmpty());
        for(String fruit:set){
            System.out.println(fruit);
        }
    }

}
