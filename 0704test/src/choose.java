public class choose {
    public int TeamNums (int[] height) {
        int len=height.length;
        int count=0;
        for(int i=0;i<len-2;i++){
            for (int j=i+1;j<len-1;j++){
                if(height[j]>height[i]){
                    for(int k=j+1;k<len;k++){
                        if (height[k]>height[j]){
                            count++;
                        }
                    }
                }else{
                    for(int k=j+1;k<len;k++){
                        if (height[k]<height[j]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}

