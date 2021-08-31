package test0829;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(k>input.length){
            return arrayList;
        }
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}