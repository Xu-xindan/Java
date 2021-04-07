package comparable;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/5
 * TIME:15:17
 */
class Teacher implements Comparable<Teacher>{
    String name;
    int age;
    int weight;
    int height;

    public Teacher(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //通过重写该方法 指导Java 进行对象大小的比较
    //natural ordering
    //大小如何有哪个条件决定 由开发者自行选择
    //此处按照年龄比较
    @Override
    public int compareTo(Teacher o) {
        if(this.age<o.age){
            return -1;
        }else if(this.age==o.age){
            return 0;
        }else{
            return 1;
        }
        //return age-o.age;等价
    }
}
public class demo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("lili",18,55,168);
        Teacher t2=new Teacher("lisa",19,60,170);
        int r=t1.compareTo(t2);
        if(r<0){
            System.out.println("lili<lisa");
        }else if(r==0){
            System.out.println("lili=lisa");
        }else{
            System.out.println("lili>lisa");
        }
    }
}
