package leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/30
 * TIME:15:31
 */
public class zhaochuzhichuxiandeshu {
    public int singlenum(int[] nums){
        Map<Integer,Integer>出现次数=new TreeMap<>();
        for(int n:nums){
            int count=出现次数.getOrDefault(n,0);
            count++;
            出现次数.put(n,count);
        }
        for(Map.Entry<Integer,Integer> entry:出现次数.entrySet()){
            int n=entry.getKey();
            int count=entry.getValue();
            if(count==1){
                return n;
            }
        }
        return -1;
    }
}
