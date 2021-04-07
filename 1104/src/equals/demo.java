package equals;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/5
 * TIME:14:54
 */

class Teacher{
    String name;

    Teacher(String name){
        this.name=name;
    }

    //覆写equals方法  如果不覆写t1.equlas(t2)也是不相等的
    @Override
    public boolean equals(Object o) {
        //检查是否为空 空一定不是
        if(o==null){
            return false;
        }
        //检查类型 不同的类型一定不能代表同一事物
        if(!(o instanceof Teacher)){
            return false;
        }
        //根据我们设计类的目的 名字相同代表同一事物
        Teacher obj=(Teacher)o;//向下转型
        //比较
        return this.name.equals(obj.name);
    }
}
public class demo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("lili");
        Teacher t2=new Teacher("lili");
        Teacher t3=new Teacher("lisa");
        //t1所指向的对象和t2所指向的对象是否代表了同一个现实事物 需要开发者指导Java
        System.out.println(t1.equals(t2));//true
        System.out.println(t2.equals(t3));//false
    }
}
