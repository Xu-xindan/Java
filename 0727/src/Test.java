/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/27
 * TIME:09:22
 */
import java.util.Scanner;
class Calculator{
    private int num1;
    private int num2;

    public int add(){
        return this.num1+this.num2;
    }

    public int sub(){
        return this.num1-this.num2;
    }

    public int sum(){
        return this.num1*this.num2;
    }
    public double div(){
        return (this.num1*1.0)/this.num2;
    }
}
public class Test{
    public int[] elem;
    public int usedsize;

    public void add(int pos,int data){

    }

    public Test(){
        this.elem=new int[10];
    }
    public static void main(String[] args) {
        //Calculator cal=new Calculator();
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,1);
    }
}
