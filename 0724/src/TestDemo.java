import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/24
 * TIME:09:06
 */

/**
 * class 类名{
 *     属性/字段：年龄，性别
 *     行为/方法
 * }
 * 1.实例化一个对象：new Person()
 * 2.一个类可以实例化多个对象
 * 3.字段：类里面，方法外面定义的变量
 * 4.基本数据类型的默认值 引用类型默认值null
 *   简单类型：0  boolean:false char:\u0000
 * 5.访问成员变量：对象的引用.成员变量
 * */
class Person{
    public int age;
    public String name;
    public static int count;
    public void eat(){
        System.out.println("吃饭");
    }
}
public class TestDemo {
    public static void main2 (String[] args) {
        Person person =new Person(); //实例化一个对象
        System.out.println(person.age);//0
        System.out.println(person.name);//访问成员变量//null
        person.eat();//访问成员方法
        Person person1=new Person();
        person1.count++;
        System.out.println(Person.count);
    }
    public static boolean isSorted(int[] array){
        if(array==null||array.length==0){
            return false;
        }
        for (int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] array){
        boolean flg=false;
        for(int i=0;i<array.length-1;i++){
            flg=false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                    flg=true;
                }
            }
            //if(flg==false){
            if(!flg){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int i=0;
        int j=array.length-1;
       while(i<=j){
                int t=array[i];
                array[i]=array[j];
                array[j]=t;
                i++;
                j--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main3(String[] args) {
        int[][] array1={{1,2,3},{4,5,6}};
        int[][] array2=new int[2][3];
        int[][] array3=new int[][]{{1,2,3},{4,5,6}};
        int[][] array4=new int[2][];//不规则数组
        array4[0]=new int[3];
        array4[1]=new int[2];
    }

    public static void main1(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        //bubbleSort(arr);
        //System.out.println(isSorted(arr));
    }

    public static void main(String[] args) {

    }
}
