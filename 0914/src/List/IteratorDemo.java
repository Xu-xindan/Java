package List;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/14
 * TIME:21:17
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        /*Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String next=it.next();
            if(next.equals("C")){
                it.remove();
            }
            System.out.println(list);
        }*/
        ListIterator<String> it1=list.listIterator(1);
        ListIterator<String> it2=list.listIterator(1);
        System.out.println(it1.next());//B
        System.out.println(it2.previous());//A
    }
}
