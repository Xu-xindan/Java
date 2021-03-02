package bracket;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/24
 * TIME:18:20
 */
public class MyQueue {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public MyQueue(){
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }

    public void push(int x){
        s2.push(x);
    }

    public int pop(){
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer e=s2.pop();
                s1.push(e);
            }
        }
        return s1.pop();
    }

   /* public int peek(){

    }*/
}
