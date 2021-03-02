package bracket;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/22
 * TIME:21:16
 */
public class MyStack {
    private Queue<Integer> queue;
    public MyStack(){
        queue=new LinkedList<>();
    }
    public void push(int x){
        queue.add(x);
    }

    public int pop(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            Integer e=queue.remove();
            queue.add(e);
        }
        return queue.remove();
    }

    public int top(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            Integer e=queue.remove();
            queue.add(e);
        }
        Integer t=queue.remove();
        queue.add(t);
        return t;
    }

    public boolean empty(){
        return queue.isEmpty();
    }
}
