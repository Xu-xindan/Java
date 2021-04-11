package leetcode;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/10
 * TIME:10:25
 */
public class twenty {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] charArray=s.toCharArray();
        for(char c:charArray){
            switch (c){
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                default:{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char left=stack.pop();
                    if(!compareBracket(left,c)){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    private boolean compareBracket(char left, char right) {
        if(left=='('&&right==')'){
            return true;
        }
        if(left=='['&&right==']'){
            return true;
        }
        if (left =='{'&&right=='}') {
            return true;
        }
        return false;
    }
}
