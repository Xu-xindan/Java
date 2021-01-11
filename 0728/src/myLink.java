/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/28
 * TIME:18:32
 */
class Nodd{
    public int data;
    public Nodd next;

    public Nodd(int data) {
        this.data = data;
    }
}
public class myLink {
    public Nodd head;

    //头插法
    public void addFirst(int data){
        Nodd nodd=new Nodd(data);
        nodd.next=head;
        head=nodd;
    }

    //尾插法
    public void addLast(int data){
        Nodd nodd=new Nodd(data);
        if(this.head==null){
            head=nodd;
        }else{
            Nodd pre=head;
            while(pre.next!=null){
                pre=pre.next;
            }
            pre.next=nodd;
        }
    }
    //任意位置插入
    public void addIndex(int index,int data){
        if(index<0||index>size()){
            System.out.println("不可");
            return;
        }
        Nodd nodd=new Nodd(data);
        Nodd cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        nodd.next=cur.next;
        cur.next=nodd;
    }
    //查找key是否包含
    public boolean contains(int key){
        Nodd cur=head;
        while(cur.next!=null){
            if(cur.data==key){
                return true;
            }
            cur =cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(head==null){
            return;
        }
        Nodd cur=head;
        while(cur.next!=null){
            if(cur.next.data==key){
                Nodd del=cur.next;
                del.next=cur.next;
            }
            cur =cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllkey(int key){

    }
    //得到单链表的长度
    public int size(){
        int count=0;
        while(head!=null){
            count ++;
            head=head.next;
        }
        return count;
    }
    //打印单链表
    public void display(){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
