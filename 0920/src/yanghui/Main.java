package yanghui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/20
 * TIME:11:50
 */
public class Main {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> outerList=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> elementList=new ArrayList<>();
            for(int j=0;j<=i;j++){
                elementList.add(1);
            }
            outerList.add(elementList);
        }
        for(int i=2;i<outerList.size();i++){
            List<Integer> elementList=outerList.get(i);
            for(int j=1;j<elementList.size()-1;j++){
                int a=outerList.get(i-1).get(j-1);
                int b=outerList.get(i-1).get(j);
                elementList.set(j,a+b);
            }
        }
        return outerList;
    }
    public static void main(String[] args) {
        for(List<Integer> list:generate(10)){
            System.out.println(list);
        }
    }
}
