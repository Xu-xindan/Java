package leetcode_mapset;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
//要求返回这个链表的 深拷贝。
class Node{
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copylist138 {
    public Node copyRandomList(Node head) {
        //1.通过遍历老的链表，复制新的链表（random指向老的链表里的结点）
        // 遍历过程中 建立老新映射（老的节点-》新的节点）
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
            Node newNode=new Node(cur.val);
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
