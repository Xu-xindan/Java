/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/3
 * TIME:09:11
 */
class animal{
    public String name;

    public animal(String name) {
        this.name = name;
        this.eat();
    }
    public void eat(){
        System.out.println("Animal::eat()");
    }
}


public class TestDemo {
}
