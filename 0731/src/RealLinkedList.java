/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/31
 * TIME:11:00
 */
class ListNode{
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
    }
}
public class RealLinkedList {
    public ListNode head;
    public ListNode tail;
    //无头双向链表实现
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    //打印
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0||index>size())return;
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        ListNode node=new ListNode(data);
        ListNode cur=head;//找到前一个结点
        while(index>0){
            cur=cur.next;
            index--;
        }
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;
    }
    //得到单链表的长度
    public int size(){
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur=head;
        while(cur!=null){
            if(cur.data==key){
                //删除头结点
                if(cur==head){
                    this.head=this.head.next;
                    head.prev=null;
                }else{//删除普通节点
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                    cur.next.prev=cur.prev;
                    }else{//删除尾节点
                        tail=cur.prev;
                    }
                }
                return;
            }else{
                cur=cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=head;
        while(cur!=null){
            if(cur.data==key){
                //删除头结点
                if(cur==head){
                    this.head=this.head.next;
                    head.prev=null;
                }else{//删除普通节点
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{//删除尾节点
                        tail=cur.prev;
                    }
                }
            }
            cur=cur.next;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=head;
        while(cur!=null){
            if(cur.data!=key) {
                cur=cur.next;
            }
            return true;
        }
        return false;
    }
    //清空
    public void clear(){
        ListNode cur=head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur.prev=null;
            cur=curNext;
        }
        head=null;
        tail=null;
    }
}
