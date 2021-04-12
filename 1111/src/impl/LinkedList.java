package impl;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/11
 * TIME:17:20
 */
public class LinkedList implements Deque{
    private static class Node{
        private Integer v;
        Node pre;
        Node next;

        Node(Integer x){
            v=x;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    @Override
    public boolean offerFirst(Integer e) {
        if(size==0){
            head=tail=new Node(e);
        }else{
            Node node=new Node(e);
            node.next=head;
            head.pre=node;
            head=node;
        }
        size++;
        return true;
    }

    @Override
    public Integer peekFirst() {
        if(size==0){
            return null;
        }
        return head.v;
    }

    @Override
    public Integer pollFirst() {
        if(size==0){
            return null;
        }
        Integer e=head.v;
        head=head.next;
        if(head!=null){
            head.pre=null;
        }else{
            tail=null;
        }
        size--;
        return e;
    }

    @Override
    public boolean offerLast(Integer e) {
        if(size==0){
            head=tail=new Node(e);
        }else{
            Node node=new Node(e);
            node.pre=tail;
            tail.next=node;
            tail=node;
        }
        size++;
        return true;
    }

    @Override
    public Integer peekLast() {
        if(size==0){
            return null;
        }
        return tail.v;
    }

    @Override
    public Integer pollLast() {
        if(size==0){
            return null;
        }
        Integer e=tail.v;
        tail=tail.pre;
        if(tail!=null){
            tail.next=null;
        }else{
            head=null;
        }
        size--;
        return e;
    }
}
