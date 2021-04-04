package java中哈希表的应用;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/3
 * TIME:20:39
 */
public class main {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        System.out.println(map.put("cpv",123));
        Set<Integer> set=new HashSet<>();
        System.out.println(set.add(12));
    }
}
