package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static int findOnce(int[] array) {
        int ret = 0;

        for(int i = 0; i < array.length; ++i) {
            ret ^= array[i];
        }

        return ret;
    }

    public static void swapNum(int[] array) {
        int i = 0;

        int tmp;
        for(int j = array.length - 1; i < j; array[j] = tmp) {
            while(array[j] % 2 == 0) {
                --j;
            }

            while(array[i] % 2 != 0) {
                ++i;
            }

            tmp = array[i];
            array[i] = array[j];
        }

    }

    public static int fab(int n) {
        if (n <= 0) {
            return -1;
        } else if (n != 1 && n != 2) {
            int f1 = 1;
            int f2 = 1;
            int f3 = 0;

            for(int i = 3; i <= n; ++i) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }

            return f3;
        } else {
            return 1;
        }
    }

    public static int func(int n){
        if (n > 9) {
            func(n/10);
        }
        System.out.println(n%10+" ");
        return 0;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
    public static int add(int n){
        if(n<10){
            return n;
        }
        return n%10+add(n/10);
    }

    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    private static int han(int n){
        if(n==1){
            return 1;
        }
        return 2*han(n-1)+1;
    }
    public static void move(char pos1,char pos2){
        System.out.println(pos1+"->"+pos2);
    }
    public static void hanota(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanota(n-1,pos1,pos2,pos3);
            move(pos1,pos3);
            hanota(n-1,pos2,pos1,pos3);
        }
    }

    public static int[] func4(){
        int[] array={1,2,3};
        return array;
    }

    public static int[] fun(){
        int[] array={1,2,3};
        int[] array2=new int[array.length];
        for(int i=0;i<array.length;i++){
            array2[i] =array[i]*2;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fun()));
    }
    public static void main3(String[] args) {
        int[] array={1,2,3,4,5};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for(int x:array){
            System.out.println(x);
        }

        //将数组以字符串形式打印
        /*String str=Arrays.toString(array);
        System.out.println(str);*/
        System.out.println(Arrays.toString(array));
    }
    public static void main2(String[] args) {
        //hanota(1,'A','B','C');
        int[] array={1,};
        System.out.println(han(4));
        //System.out.println(add(123));
       // System.out.println(sum(4));
        //System.out.println(fab(4));
    }

    public static void main1(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        swapNum(array);
        for(int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
