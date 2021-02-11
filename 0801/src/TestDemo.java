/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/1
 * TIME:09:10
 */
import java.util.Arrays;
import java.util.*;//导入所有类
import java.util.concurrent.Callable;

class Animal{
    protected String name;

    public Animal(String name) {
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"正在吃");
    }
}

class Cat extends Animal{
   /* public String name;
    public void eat(){
        System.out.println(this.name+"正在吃");
    }*/
    public void Jump(){
        System.out.println(this.name+"正在跳");
    }
    public Cat (String name){
        super(name);
    }
}

class Bird extends Animal{

   /* public String name;
    public void eat(){
        System.out.println(this.name+"正在吃");
    }*/
   public Bird (String name){
       super(name);
   }
    public void Fly(){
        System.out.println(this.name+"正在飞");
    }
}
public class TestDemo {
    public static void func(Animal animal){

    }
    public static void main(String[] args) {
        //第一种：直接赋值
        Animal animal=new Cat("咪咪");
        //父类的引用，引用子类的对象
        //第二种：方法传参
        Cat cat=new Cat("咪咪");
        func(cat);
    }
    //第三种：返回值
    public static Animal func2(){
        Cat cat=new Cat("咪咪");
        return cat;
    }
    public static void main2(String[] args) {
        Animal animal=new Animal("an");
        Cat cat=new Cat("咪咪");
        Bird bird=new Bird("八哥");
        cat.eat();
    }
    public static void main1(String[] args) {
        int[] array={1,2,3,4,5,6};//头文件用
        String str=java.util.Arrays.toString(array);//直接用
    }
}
