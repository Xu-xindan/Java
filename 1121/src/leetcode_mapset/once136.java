package leetcode_mapset;

import java.util.Map;
import java.util.TreeMap;

//给定一个非空整数数组，除了某个元素只出现一次以外，
//其余每个元素均出现两次。找出那个只出现了一次的元素。
public class once136 {
    //更好的方法 异或 相等的数字异或为0
    public int singleNumber(int[] nums) {
        //1.遍历整个数组，找到key-value
        //2.遍历整个关系 找到value=1的
        Map<Integer,Integer> times=new TreeMap<>();
        for(int n:nums){
            int count=times.getOrDefault(n,0);
            count++;
            times.put(n,count);
        }
        for(Map.Entry<Integer,Integer> entry:times.entrySet()){
            Integer V=entry.getValue();
            Integer K=entry.getKey();
            if(V==1){
                return K;
            }
        }
        return -1;
    }
}
