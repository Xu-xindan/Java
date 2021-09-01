package test0901;

import java.util.*;

public class Only {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String string=sc.next();
        String[] strings=string.split(",");
        Set<Integer> set=new HashSet<Integer>();
        for(int i = 0; i <strings.length; i++) {
            int s=Integer.parseInt(strings[i]);
            if(!set.contains(s)){
                set.add(s);
            }else{
                for (int j = 1; j <100 ; j++) {
                    count++;
                    if(!set.contains(s+j)){
                        set.add(s+j);
                        break;
                    }
                }
            }
        }


        System.out.println(count);
    }
}
