package test0829;

import java.util.Arrays;

public class test {
    public static int[] strNum(String str){
        int[] res=new int[4];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                res[0]++;
            }else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                res[1]++;
            }else if(str.charAt(i)>='A'&&str.charAt(i)<='z'){
                res[2]++;
            }else{
                res[3]++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String string="hdnmx78&* (0 ";
        for(int i=0;i<4;i++){
            System.out.println(strNum(string));
        }
    }
    public int sumup(int[] inputArray) {
        // write code here
        int res=0;
        if(inputArray.length!=6){
            return 0;
        }
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i]<inputArray[0]){
                res+=inputArray[i];
            }
        }
        return res;
    }

    public int[] sort_data(int[] list_data) {
        // write code here
        int[] res=new int[list_data.length];
        int end=list_data.length-1;
        for(int i=list_data.length-1;i>0;i--){
            if(list_data[i]!=0){
                res[end]=list_data[i];
                end--;
            }
        }
        return res;
    }
}
