/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/29
 * TIME:10:47
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
    //面试题
    //反转一个单链表
    public Node reverse(Node head){
        Node newHead=null;//新的链表的头节点
        Node prev=null;//当前需要反转的节点的前驱
        Node cur=this.head;//需要反转的节点
        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //找中间节点
    public Node middleNode(Node head){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    //找出倒数第k个节点
    public Node findkthToTail(Node head,int k){
        Node fast=this.head;
        Node slow=this.head;
        if(k<=0){
            return null;
        }
        if(head==null){
            return null;
        }
        for(int i=1;i<k;i++){
            if(fast.next==null){
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(Node head, int x) {
        Node bs=null;
        Node be=null;
        Node as=null;
        Node ae=null;
        Node cur=this.head;
        while (cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    //第一次进行插入(尾插)
                    bs=cur;
                    be=bs;
                }else {
                    be.next=cur;
                    be=cur;
                }
            }else {
                if(as == null) {
                    //第一次进行插入(尾插)
                    as=cur;
                    ae=as;
                }else {
                    ae.next=cur;
                    ae=cur;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }
    // 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public Node deleteDuplication(Node head){
        Node cur=this.head;
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while(cur!=null){
            if(cur.next!=null&&cur.data==cur.next.data){
                while(cur.next!=null&&cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                tmp.next=cur;
                tmp=cur;
                cur=cur.next;
            }
        }
        tmp.next=null;
        return newHead.next;
    }
    //链表的回文结构
    public boolean chkPalindrome(Node A){
        if(this.head==null){
            return false;
        }
        if(this.head.next==null){
            return true;
        }
        Node fast=head;
        Node slow=head;
        Node cur;
        //一半
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //反转
        cur=slow.next;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //判断data是否相同
        Node start=head;
        while(start!=slow){//while(start!=slow&&start.next!=slow)不用偶数节点那个循环了 快
            if(slow.data !=start.data) {
                return false;
            }
            //偶数结点
            if(start.next==slow){
                return true;
            }
            start=start.next;
            slow=slow.next;
        }
        return true;
    }
    //判断链表中是否有环
    public boolean hasCycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    //给定一个链表，返回链表开始入环的第一个节点。如果链表无环，则返回null
    public Node detectCycle(Node head){
        Node fast=head;
        Node slow=head;
        //找到相遇点
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
               break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        //相遇点到入口点的距离等于起始位置到入口点的位置
        slow=this.head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
    //输入两个链表，找出它们的第一个公共结点
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA==null||headB==null){
            return null;
        }
        Node cura=headA;
        Node curb=headB;
        int m =0,n=0;
        while(cura!=null){
            m++;
            cura=cura.next;
        }
        while(curb!=null){
            n++;
            curb=curb.next;
        }
        int c=m-n;
        cura=headA;
        curb=headB;
        if(c<0){
            cura=headB;
            curb=headA;
            c=-c;
        }
        /*Node pl=m>=n?headA:headB;//√
        Node ps=m>=n?headB:headA;
        int a=Math.abs(m-n);
        while(a>0){
            a--;
            pl=pl.next;
        }
        for(int i=0;i<Math.abs(m-n);i++){
            pl=pl.next;
        }*/
        while(c>0){
            c--;
            cura=cura.next;
        }
        while(cura!=null&&curb!=null&&cura!=curb){
            cura=cura.next;
            curb=curb.next;
        }
        if(cura==curb&&cura!=null){
            return cura;
        }
        return null;
    }
    //将两个有序链表合并为一个新的有序链表并返回 新链表是通过拼接给定的两个链表的所有节点组成的
    public Node mergeTwoLists(Node headA,Node headB) {
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else{
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }
}
