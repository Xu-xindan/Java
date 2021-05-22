package leetcode_mapset;

import java.util.Map;
import java.util.TreeMap;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//map
public class twoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numToIndex=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int x=target-n;
            if(numToIndex.containsKey(x)){
                int index=numToIndex.get(x);
                return new int[]{index,i};
            }
            numToIndex.put(n,i);
        }
        return new int[]{0,0};
    }
}
