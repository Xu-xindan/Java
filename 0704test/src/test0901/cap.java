package test0901;

import java.util.Arrays;
import java.util.Scanner;

public class cap {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cap=sc.nextInt();
        String[] strings=s.split(",");
        int[] ints=new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(capa(ints,cap));
    }
    public static int capa(int[] ints,int cap){
        Arrays.sort(ints);
        int sum=ints[0];
        if(sum>cap){
            return 0;
        }
        int count=1;
        for (int i = 1; i < ints.length; i++) {
            sum+=ints[i];
            if(sum>cap){
                return count;
            }else{
                count++;
            }
        }
        return count;
    }*/
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run(){
                System.out.println("hello");
            }
        };
        t.run();
        System.out.println("y");
        t.run();
    }
}
