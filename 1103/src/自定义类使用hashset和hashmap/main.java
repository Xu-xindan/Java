package 自定义类使用hashset和hashmap;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/3
 * TIME:20:54
 */
public class main {
    public static void main(String[] args) {
        person p1=new person("gb",18);
        person p2=new person("gb",18);

        HashMap<person,String> map=new HashMap<>();
        System.out.println(map.put(p1,"gb"));
    }
}
