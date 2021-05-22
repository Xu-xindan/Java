package leetcode_mapset;

import java.util.Set;
import java.util.TreeSet;

public class stone771 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> 宝石=new TreeSet<>();
        char[] jchars=J.toCharArray();
        for(char j:jchars){
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
