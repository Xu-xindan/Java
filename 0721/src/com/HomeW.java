package com;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class HomeW {
    public static void main1(String[] args) {
        int a=10;
        int b=20;
        int ret=maxInt(a,b);
        System.out.println(ret);

        double a1=1.5;
        double b1=4.3;
        double ret1=maxDouble(a1,b1);
        System.out.println(ret1);

        double a2=9.0;
        double b2=8.2;
        int c=12;
        double ret2=maxID(a2,b2,c);
        System.out.println(ret2);
    }

    public static int maxInt(int x,int y){
        return x>y?x:y;
    }

    public static double maxDouble(double x,double y){
        return x>y?x:y;
    }

    public static double maxID(double x,double y,int z){
        return maxDouble(x,y)>(double)z?maxDouble(x,y):(double)z;
    }

    public static void main2(String[] args) {
       int a1=10;
       int b1=20;
       int ret1=addInt(a1,b1);
       System.out.println(ret1);

       double a2=1.5;
       double b2=8.4;
       double c=9.5;
       double ret2=addDouble(a2,b2,c);
        System.out.println(ret2);
    }

    public static int addInt(int x,int y){
        return x+y;
    }

    public static double addDouble(double x,double y,double z){
        return x+y+z;
    }

    public static void main3(String[] args) {
        //int ret=han(3);
        //int ret=fib(4);
        //int ret=addNum(134);
        //print(123);
        //int ret=Sum(10);
        int ret =jumpFloor(4);
        System.out.println(ret);
    }

    public static int jumpFloor(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else {
            return jumpFloor(n - 1) + jumpFloor(n - 2);
        }
    }
    public static int mulNum(int n){
        if(n==1){
            return 1;
        }
        return mulNum(n-1)*n;
    }

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n+Sum(n-1);
    }

    public static void print(int n){
        if(n>9){
            print(n/10);
        }
        System.out.println(n%10);
    }

    public static int addNum(int n){
        int sum=0;
       if(n<10){
           return n;
       }
       return sum =n%10+addNum(n/10);
    }

    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int han(int n) {
        return n == 1 ? 1 : 2 * han(n - 1) + 1;
    }

    public static void main(String[] args) {
        int[] arr=new int [100];
        for(int i=0;i<100;i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main4(String[] args) {
        int[] arr={1,2,3,4,5};
        //transform(arr);
        printArray(arr);
       // int ret=avg(arr);
        /*int ret=sum(arr);
        System.out.println(ret);*/
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void transform(int[] array){
        int[] array1=new int[array.length];
        for(int i=0;i<array.length;i++){
            array1[i]=array[i]*2;
        }
        System.out.println(Arrays.toString(array1));
    }
    public static int sum(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static int avg(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
}
