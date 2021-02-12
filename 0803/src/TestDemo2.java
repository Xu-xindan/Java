import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/3
 * TIME:09:29
 */
class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⭕");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}

abstract class shape2{
    //抽象方法
    public abstract void draw();
}
class Cycle2 extends shape2{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}

interface Shape3{
    int a=10;//默认public static final
    void draw();//默认public abstract
    int COUNt=10;
    /*dafault void func(){

    }*/
}
class Cycle3 implements Shape3{
    @Override
    public void draw() {
        System.out.println("");
    }
}

interface IA{
    void funcA();
}
interface IB{
    void funcB();
}
interface ID extends IA,IB{//扩展
    void funcD();//同时有IA IB两个接口的功能
}
class Demo implements IA,IB{
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}

class Animal{
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying{
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class cat extends Animal implements IRunning{
    public cat(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}
class fish extends Animal implements ISwimming{
    public fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }
}
class student implements Comparable<student>{
    public String name;
    public int age;
    public double score;

    public student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(student o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age==o.age){
            return 0;
        }else{
            return -1;
        }
    }
}

class Person implements Cloneable{
    public String name;
    public  Money m ;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person=(Person)super.clone();
        person.m=(Money)this.m.clone();
        return super.clone();
    }
}

class Money implements Cloneable{
    public double money=12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo2 {
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void walk(IRunning iRunning){
        iRunning.run();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person("gaobo");
        Person person1=(Person)person.clone();
        person1.m.money=18.5;
    }

    public static void main3(String[] args) {
        student[] students=new student[3];
        students[0]=new student("bit",43,67.9);
        students[1]=new student("gaobo",34,98.2);
        students[2]=new student("aobai",34,67.6);
        Arrays.sort(students);
    }
    public static void main2(String[] args) {
        IRunning iRunning=new cat("咪咪");
        walk(iRunning);
    }
    public static void main1(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new Rect();
        drawMap(shape1);
        drawMap(shape2);
        Cycle cycle=new Cycle();
        drawMap(cycle);
    }
}
