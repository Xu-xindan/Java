package leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/10
 * TIME:11:16
 */
public class use_stacktoqueue {
    private Deque<Integer> s1;
    private Deque<Integer> s2;
    /** Initialize your data structure here. */
    public use_stacktoqueue() {
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer e=s2.pop();
                s1.push(e);
            }
        }
        return s1.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer e=s2.pop();
                s1.push(e);
            }
        }
        return s1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}
