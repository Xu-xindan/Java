package leetcodep771;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/3
 * TIME:14:59
 */
public class Solution {
    public int JeweisInStones(String J,String S){
        Set<Character> 宝石=new TreeSet<>();
        char[] Jchars=J.toCharArray();
        for(char j:Jchars){
            宝石.add(j);
        }
        int count=0;
        char[] schars=S.toCharArray();
        for(char s:schars){
            if(宝石.contains(s)){
                count++;
            }
        }
        return count;
    }
}
