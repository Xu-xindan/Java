package test0923;

import java.util.HashSet;
import java.util.Set;

public class notRepeate {
    public int findNoRepeatSubStringLength (String str) {
        // write code here
        int max=0;
        for(int i=0;i<str.length();i++) {
            int j=i;
            int count = 0;
            Set<Character> set = new HashSet<>();
            while (j < str.length()) {
                if (!set.contains(str.charAt(j))){
                    set.add(str.charAt(i));
                    count++;
                    max=max>count?max:count;
                    j++;
                }else{
                    break;
                }
            }
        }
        return max;
    }
}
