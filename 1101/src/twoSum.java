import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/3
 * TIME:14:19
 */
public class twoSum {
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> numToIdx=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int x=target-n;
            if(numToIdx.containsKey(x)){
                int oIdx=numToIdx.get(x);
                return new int[] {oIdx,i};
            }
            numToIdx.put(n,i);
        }
        return new int[]{0,0};
    }
}
