/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/28
 * TIME:09:40
 */
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
    }
}
public class MyLinkedList {
    public Node head;//标识头结点

    //public int usedSize;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    //打印
    public void display() {
        Node i = this.head;
        while (i != null) {
            System.out.print(i.data + " ");
            i = i.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        if (index < 0 || index > getLength()) {
            System.out.println("不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
        }
        if (index == this.getLength()) {
            addLast(data);
        }
        Node cur = searchPrev(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

    public Node searchPrev(int index) {
        Node cur = this.head;
        int count = 0;
        while (count < index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //得到单链表的长度
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node cur = searchPrevNode(key);
        if (cur == null) {
            System.out.println("没有你要删除的数字");
            return;
        }
        Node del = cur.next;
        cur.next = del.next;
    }

    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if(this.head==null)return;
        Node prev=this.head;
        Node cur=this.head.next;
        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=prev.next;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }
    //查找是否包含key
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null) {
            if (cur.data == key) {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //清空
    public void clear(){
        this.head=null;//头结点为空 无法被引用
    }
}
