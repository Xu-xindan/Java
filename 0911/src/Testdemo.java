/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/11
 * TIME:19:30
 */
class Teacher{
    String name;
    int age;
    int height;
    int weight;

    Teacher(String name){
        this.name=name;
    }

    public Teacher(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    //对象是否代表同一个事物
    public boolean equals(Object obj) {
        //this不是null,检查obj是不是null
        if(obj==null){
            return false;
        }
        //检查类型，不同的类型代表不了同一个事物
        if(!(obj instanceof Teacher)){
            return false;
        }
        //根据我们的设计类目的，来判断对象是否代表同一类
        Teacher o=(Teacher)obj;
        return this.name.equals(o.name);
    }

    public int compareTo(Teacher o){
        if(this.age<o.age){
            //
            return -1;
        }else if(this.age==o.age){
            return 0;
        }else{
            return 1;
        }
    }
}
public class Testdemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("gaobo",18,190,80);
        Teacher t2=new Teacher("chenpeixin",19,180,100);
        int r=t1.compareTo(t2);
        if(r<0){
            System.out.println("gaobo<chenpeixin");
        }else if(r==0){
            System.out.println("gaobo=chenpeixin");
        }else{
            System.out.println("baobo>chenpeixin");
        }
    }
}
