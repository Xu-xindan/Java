package map的使用;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:19:04
 */
public class mapdemo {
    public static void main(String[] args) {
        Map<String,Integer> 通讯录=new TreeMap<>();
        Integer v=通讯录.put("cpx",123);
        v=通讯录.put("cpx",456);
        v=通讯录.remove("cpx");
        System.out.println(v);
    }
}
