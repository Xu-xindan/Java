package leetcode;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:20:55
 */
public class fuzhilianbiao138 {
    //普通复制链表
    public static Node simplecopy(Node head){
        Node newfakeHead =new Node(-1);
        Node newlast=newfakeHead;
        Node cur=head;
        while(cur!=null){
            Node newNode=new Node(cur.value);
            newlast.next=newNode;
            newlast=newNode;
            cur=cur.next;
        }
        return newfakeHead.next;
    }

    //复制带随机指针的链表
    public static Node copyRandomList(Node head){
        Map<Node,Node> 老新映射=new TreeMap<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.hashCode()-o2.hashCode();
            }
        });
        Node newfakeHead=new Node(-1);
        Node newlast=newfakeHead;
        Node cur=head;
        while(cur!=null){
            Node newNode=new Node(cur.value);
            newlast.next=newNode;
            newlast=newNode;
            //建立老新映射
            老新映射.put(cur,newNode);
            cur=cur.next;
        }
        //处理random
        Node oldcur=head;
        Node newcur=newfakeHead.next;
        Node oldRandom=head.random;
        Node newRandom;
        while(oldcur!=null){
            if(oldRandom==null){
                newRandom=null;
            }else{
                newRandom=老新映射.get(oldRandom);
            }
            newcur.random=newRandom;
            oldcur=oldcur.next;
            newcur=newcur.next;
        }
        return newfakeHead.next;
    }
}
