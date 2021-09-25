package test0923;

abstract class Person{
    abstract void doSomething();
}
public class test extends Person{
    public test(){
        System.out.printf("   ");
    }

    public static void main(String[] args) {
        test test=new test();
    }

    @Override
    void doSomething() {

    }
}
