import com.sun.javafx.scene.control.TableColumnComparatorBase;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/11
 * TIME:21:09
 */
public class GenericMethodDemo {
    public static void bubble(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }

    public static <T>void bubble(T[] array, Comparator<T> comparator){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                int r=comparator.compare(array[j],array[j+1]);
                if(r>0){
                    T t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
    /*public static void main(String[] args) {
        Teacher[] teachers=new Teacher[10];

        GenericMethodDemo.<Teacher>bubble(teachers);
        GenericMethodDemo.bubble(teachers);
        bubble(teachers);
    }*/
}
