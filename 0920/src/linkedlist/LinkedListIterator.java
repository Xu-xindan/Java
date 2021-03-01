package linkedlist;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/20
 * TIME:11:42
 */
public class LinkedListIterator implements Iterator{
    private LinkedList list;
    private Node current;

    public LinkedListIterator(LinkedList list){
        this.list=list;
        this.current=list.head;
    }
    @Override
    public boolean hasNext() {
        return current!=null;
    }

    @Override
    public Integer next() {
        Integer e=current.element;
        current=current.next;
        return e;
    }
}
