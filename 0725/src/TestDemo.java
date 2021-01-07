/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/25
 * TIME:08:49
 */
import java.util.Arrays;
import java.util.Scanner;
class Person {
    public static int age;
    public String name;

    public static int count;

    public  void func() {
        System.out.println("静态方法");
    }
}
class MyVal{
    public int val;
}
class Student{
    private String name;
    private int age;
    public void show(){
        System.out.println("我叫"+this.name+"年龄："+this.age);
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override//注解 代表当前方法是重写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }//Alt+Insert

    public void func(){
        System.out.println("func");
    }
    public void func2(){
        this.func();
        System.out.println("func2");
    }
    {
        this.age=10;
        System.out.println("实例代码块");
    }
    static{
        //this.age=888;//不可以 静态不依赖于对象
        System.out.println("静态代码块");
    }
}
public class TestDemo {
    public static void main2(String[] args) {
        /*Student student=new Student();
        System.out.println(student.getname());
        student.name="bit";
        System.out.println(student.name);*/
    }
    public static void swap(MyVal a,MyVal b){
        int t=a.val;
        a.val=b.val;
        b.val=t;
    }
    public static void main1(String[] args) {
        //Person person1=new Person();
        MyVal myval1=new MyVal();
        myval1.val=10;
        MyVal myval2=new MyVal();
        myval2.val=20;
        swap(myval1,myval2);
    }

    public static void transform(int[] array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            while(left<right&&array[left]%2==0){
                left++;
            }
            while(left<right&&array[right]%2!=0){
                right--;
            }
            int t=array[left];
            array[left]=array[right];
            array[right]=t;
        }
    }

    public void fun(){

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
        //fun();
        Person p=new Person();
        p.func();
    }
}
