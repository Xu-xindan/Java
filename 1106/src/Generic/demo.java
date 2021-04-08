package Generic;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/6
 * TIME:10:06
 */
class Teacher{
    String name;
    int age;
}
public class demo {
    public static <T> void bubbleSort(T[] array){}
    public static void main(String[] args) {
        Teacher[] teachers=new Teacher[10];
        //完整写法，传入Teacher，表示方法定义时T就是Teacher类型
        demo.<Teacher>bubbleSort(teachers);
        //编译器有能力算出来，这里T就是Teacher类型
        demo.bubbleSort(teachers);
        //本类中调用，类名可以忽略
        bubbleSort(teachers);
    }
}
