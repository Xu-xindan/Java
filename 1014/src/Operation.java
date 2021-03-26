/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/14
 * TIME:18:49
 */
public class Operation {
    public static Node headInsert(Node head,int e){
        Node node=new Node(e);
        if(head!=null){
            node.next=head;
        }
        return node;
    }

    public static Node tailInsert(Node head,int e){
        Node node =new Node(e);
        Node n=head;
        while(head!=null){
            head=head.next;
        }
        head.next=node;
        return n;
    }

    /*public static Node headDel(Node head){
        if(head==null){
            return null;
        }

    }*/
}
