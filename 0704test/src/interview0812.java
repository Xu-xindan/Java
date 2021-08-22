public class interview0812 {
    //[1,2,3,0,0,0] [2,5,6]
    public static int[] heBing(int[] array1,int[] array2,int m1,int m2){
        int[] res=new int[array1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m1&&j<m2){
            if(array1[i]>=array2[j]){
                res[k++]=array2[j++];
            }else{
                res[k++]=array1[i++];
            }
        }
        if(i>=m1){
            while(j<m2){
                res[k++]=array2[j++];
            }
        }else{
            while(i<m1) {
                res[k++] = array1[i++];
            }
        }
        for(int m=0;m<array1.length;m++){
            array1[m]=res[m];
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] array1={1,2,3,0,0,0};
        int[] array2={2,4,6};
        int m1=3;
        int m2=3;
        int[] res=heBing(array1,array2,m1,m2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
