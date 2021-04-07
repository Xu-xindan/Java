package comparator;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/5
 * TIME:15:47
 */
class Teacher {
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
}

class ByHeightComparator implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.height-o2.height;
    }
}

class ByWeightComparator implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.weight-o2.weight;
    }
}

public class demo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("lili",18,65,168);
        Teacher t2=new Teacher("lisa",19,60,170);
        Comparator<Teacher> byheight=new ByHeightComparator();
        Comparator<Teacher> byweight=new ByWeightComparator();

        int r1=byheight.compare(t1,t2);
        int r2=byweight.compare(t1,t2);
        System.out.println(r1);
        System.out.println(r2);
    }
}
