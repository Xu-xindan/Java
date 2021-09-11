package test0908;

import java.util.Scanner;

public class together {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] strings1=s1.split(" ");
        String[] strings2=s2.split(" ");
        int[] nums1=new int[strings1.length];
        int[] nums2=new int[strings2.length];
        int[] nums=new int[strings1.length+strings2.length];
        int i=0;
        int j=0;
        int k=0;
        while(j<strings1.length&&k<strings2.length){
            if(Integer.parseInt(strings1[j])<=Integer.parseInt(strings2[k])){
                nums[i++]=Integer.parseInt(strings1[j]);
                j++;
            }else{
                nums[i++]=Integer.parseInt(strings2[k]);
                k++;
            }
        }
        if(j==strings1.length){
            while(k<strings2.length){
                nums[i++]=Integer.parseInt(strings2[k]);
                k++;
            }
        }
        if(k==strings2.length){
            while(j<strings1.length){
                nums[i++]=Integer.parseInt(strings1[j]);
                j++;
            }
        }
        for (int l = 0; l < nums.length; l++) {
            System.out.print(nums[i]+" ");
        }
    }
}
