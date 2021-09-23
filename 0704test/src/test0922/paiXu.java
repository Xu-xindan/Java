package test0922;

public class paiXu {
    public int[] sort_data(int[] list_data) {
        // write code here
        int[] res=new int[list_data.length];
        int start=0;
        for (int i = 0; i < list_data.length; i++) {
            if(list_data[i]==0){
                res[start++]=0;
            }
        }
        for (int i = 0; i < list_data.length; i++) {
            if(list_data[i]!=0){
                res[start++]=list_data[i];
            }
        }
        return res;
    }
}
