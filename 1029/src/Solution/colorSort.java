package Solution;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:18:04
 */
public class colorSort {
    private void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                swap(nums,i,0);
                break;
            }
        }
        int i=0;
        int t=1;
        int j=nums.length-1;
        while(j>=t){
            if(nums[t]>1){
                swap(nums,t,j);
                j--;
            }else if(nums[t]<1){
                swap(nums,t,i);
                t++;
                i++;
            }else{
                t++;
            }
        }
    }
}
