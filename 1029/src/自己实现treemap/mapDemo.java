package 自己实现treemap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:19:59
 */
public class mapDemo {
    public static void TreeMap(){
        Map<String,Integer> m=new TreeMap<>();
        m.put("cpx",123);
        m.put("gb",456);
        System.out.println(m);
        System.out.println(m.containsKey("bg"));
        System.out.println(m.containsValue(123));
        System.out.println(m.get("cpx"));
        System.out.println(m.getOrDefault("cpx",478));
        System.out.println(m.entrySet());
    }
}
