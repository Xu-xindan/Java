/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/10
 * TIME:19:56
 */

public class Reverse {
    public class Node{
        public int val;
        public Node next;
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node curPrev=null;
        Node temp=null;
        while(cur!=null){
            if(cur.next==null){
                temp=cur;
            }
            Node curNext=cur.next;
            cur.next=curPrev;
            curPrev=cur;
            cur=curNext;
        }
        return temp;
    }

}
