/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/28
 * TIME:10:05
 */
public class TestDemo {
    public static void main(String[] args) {
        myLink myLink=new myLink();
        myLink.addFirst(6);
        myLink.addLast(6);
        myLink.addLast(7);
        myLink.addFirst(1);
        //myLink.contains(0);
        myLink.display();
        myLink.remove(6);
        myLink.display();
        //myLinkedList.removeAllKey(6);
       //myLinkedList.display();
    }
}
