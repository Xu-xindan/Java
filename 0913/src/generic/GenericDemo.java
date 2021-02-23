package generic;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/13
 * TIME:09:15
 */
public class GenericDemo {
    public static <T> void someMethod(){}//没使用T但是不报错
    /*public static <X> void someMethod(T a){} 错的T没定义*/
    /*public static <X> void someMethod(X a,X b){}
    public static void main(String[] args) {
        B.<X>someMethod(a,b);
    } 使用方法时不存在 a b X*/
}
