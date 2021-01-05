import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/23
 * TIME:09:49
 */
public class TestDemo {
    public static String myString(int[] array){
        String a="[";
        for(int i=0;i<array.length-1;i++){
            a=a+array[i]+",";
        }
        a=a+array[array.length-1]+"]";
        return a;
    }

    public static int max(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int avg(int[] array){
        int sum=0;
        int avg=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            avg=sum/array.length;
        }
        return avg;
    }

    public static int binarySearch(int[] array,int key){
        int left=0;
        int right=array.length;
        while(left<right){
            int mid=(right+left)/2;
            if(array[mid]==key){
                System.out.println("找到了是"+array[mid]);
            }else if(array[mid]<key){
                left+=1;
            }else{
                right-=1;
            }
        }
        return -1;
    }

    public static void bubble(int[] array){
        int t=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void judge(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                System.out.println("数组不是有序的");
            }
        }
        System.out.println("数组是有序的");
    }

    public static void copyOf(int[] array){
        int[] array1=new int[array.length];
        for(int i=0;i<array.length;i++){
            array1[i]=array[i];
        }
        System.out.println(Arrays.toString(array1));
    }

    public static void main1(String[] args) {
        int[] array={1,2,3,4,5};
        copyOf(array);
        //judge(array);
        //bubble(array);
        //int ret=binarySearch(array,10);
        //int ret=max(array);
        //int ret=avg(array);
       // System.out.println(ret);
        /*int[] ret= Arrays.copyOfRange(array,2,4);
        System.out.println(Arrays.toString(ret));//[3,4]*/
        /*int[] ret=array.clone();*/
       /* int[]  ret=new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);*/
       /* String Arr=myString(array);
        System.out.println(Arr);*/
    }
    public static void twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        twoSum(nums,target);
    }
}
