package generic;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/13
 * TIME:09:38
 */
public class Person<T> {
    public String name;
    public int age;

    public T especial;

    public Person(String name,int age,T especial){
        this.name=name;
        this.age=age;
        this.especial=especial;
    }

    public static void main(String[] args) {
        Person<String> p1=new Person<>("String",18,"String");
    }
}
