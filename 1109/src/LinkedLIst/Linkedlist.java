package LinkedLIst;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/9
 * TIME:09:38
 */
public class Linkedlist implements List {
    public Node head;//第一个结点
    public Node last;//最后一个结点
    public int size;

    @Override
    //尾插 o(1)
    public boolean add(Integer e) {
        Node node=new Node(e);
        if(size==0){
            head=node;
            last=node;
        }else{
            last.next=node;
            node.prev=last;
            last=node;
        }
        size++;
        return true;
    }

    @Override
    //任意位置插入 o(n)
    public void add(int index, Integer e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        Node node=new Node(e);
        if(index==0){
            node.next=head;
            head.prev=node;
            head=node;
        }else if(index==size){
            add(e);
        }else{
            Node cur=head;
            Node pre=null;
            for(int i=0;i<index;i++){
                pre=cur;
                cur=cur.next;
            }
            pre.next=node;
            node.prev=pre;
            node.next=cur;
            cur.prev=node;
            size++;
        }
    }

    @Override
    //删除index所在位置下标  O(n)
    public Integer remove(int index) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        //走到这里size一定＞0
        Integer v;
        if(index==0){
            v=head.element;
            head=head.next;
            head.prev=null;
            size--;
            if(size==0){
                last=null;
            }
        }else if(index==size-1){
            v=last.element;
            last=last.prev;
            last.next=null;
            size--;
            if(size==0){
                head=null;
            }
        }else{
            Node cur=head;
            Node pre=null;
            for(int i=0;i<index;i++){
                pre=cur;
                cur=cur.next;
            }
            pre.next=cur.next;
            cur.next.prev=pre;
            v=cur.element;
            size--;
        }
        return v;
    }

    @Override
    //删除值为e的结点 o(n)
    public boolean remove(Integer e) {
        Node pre=null;
        for(Node cur=head;cur!=null;pre=cur,cur=cur.next){
            if(cur.element.equals(e)){
                if(pre==null){
                    remove(0);
                    return true;
                }else{
                    pre.next=cur.next;
                    cur.next.prev=pre;
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    //得到index下标处的值 o(n)
    public Integer get(int index) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.element;
    }

    @Override
    //修改index下标处的值 O(n)
    public Integer set(int index, Integer e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        Integer v=cur.element;
        cur.element=e;
        return v;
    }

    @Override
    //o(1)
    public int size() {
        return size;
    }

    @Override
    //o(1)
    public void clear() {
        head=null;
        last=null;
        size=0;
    }

    @Override
    //O(1)
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    //o(n)
    public boolean contains(Integer e) {
        return indexOf(e)!=-1;
    }

    @Override
    //o(n)
    public int indexOf(Integer e) {
        int i=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur.element.equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    //o(n)
    public int lastIndexOf(Integer e) {
        int i=size-1;
        for(Node cur=last;cur!=null;cur=cur.prev,i--){
            if(cur.element.equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("[");
        for(Node cur=head;cur!=null;cur=cur.next){
            sb.append(cur.element);
            if(cur!=last){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
