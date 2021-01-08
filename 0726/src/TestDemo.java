/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/26
 * TIME:09:07
 */
class Student{
    private String name;
    private int age;

    public void show(){
        System.out.println("我叫"+name+"年龄"+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(){
        System.out.println("Student()!");
    }

    public Student(String name){
        this.name=name;
        System.out.println("Student(String)!");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void func(){
        {
            System.out.println("本地代码块");//定义在方法内，没什么用
        }
        System.out.println("func()");
    }

    {
        System.out.println("实例代码块/构造代码块");
    }

    static{
        System.out.println("静态代码块");
    }
}

class Person{
    private String name;
    private int age;
    private String sex;

    public Person(){
        this("Anna",18,"woman");//this();构造方法
    }

    public Person(String name, int age, String sex) {
        this.name = name;//this.成员变量
        this.age = age;
        this.sex = sex;
    }

    public void show(){
        System.out.println("name:"+name+"age:"+age+"sex:"+sex);
    }

    public void fun(){
        this.show();//this.成员方法
        System.out.println("fun()");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
    }
    public static void main2(String[] args) {
        Student student=new Student();
        Student student2=new Student("Anna");
        System.out.println(student2.getName());
        Student student3=new Student("Anna",12);
    }
    public static void main1(String[] args) {
        Student student=new Student();
        student.show();
        student.setName("bit");
        System.out.println(student.getName());
        System.out.println(student);
    }
}
