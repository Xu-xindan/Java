package leetcode;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/24
 * TIME:19:10
 */
public class minStack {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public minStack(){
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }

    public void push(int x){
        s1.push(x);
        if(s2.isEmpty()){
            s2.push(x);
        }else{
            int t=s2.peek();
            if(x<t){
                s2.push(x);
            }else{
                s2.push(t);
            }
        }
    }
    public void pop(){
        s1.pop();
        s2.pop();
    }

    public int top(){
        return s1.peek();
    }

    public int getMin(){
        return s2.peek();
    }
}
