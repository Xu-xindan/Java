package bracket;
import java.util.Deque;
import java.util.LinkedList;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/22
 * TIME:20:32
 */
public class Solution {
    public boolean isValid(String s){
        Deque<Character> stack=new LinkedList<>();
        char[] charArray=s.toCharArray();
        for(char c:charArray){
            switch(c){
                case'(':
                case'[':
                case'{':
                    stack.push(c);
                    break;
                default: {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char left = stack.pop();
                    if (!compareBracket(left, c)) {
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
    private boolean compareBracket(char left,char right){
        if(left=='('&&right==')'){
            return true;
        }
        if(left=='['&&right==']'){
            return true;
        }
        if(left=='{'&&right=='}'){
            return true;
        }
        return false;
    }
}
