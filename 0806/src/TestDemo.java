import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/6
 * TIME:09:21
 */
class MyException extends Exception{}
public class TestDemo {
    public static String reverse(String str,int begin,int end){
       char[] arr=str.toCharArray();
       char t;
       while(begin<end){
           t=arr[begin];
           arr[begin]=arr[end];
           arr[end]=t;
           begin++;
           end--;
       }
        return new String(arr);
    }

    public static void main1(String[] args) {
        String str="abcdef";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        String str="a,b,c,d";
        StringBuffer sb=new StringBuffer(str);
        StringBuilder sb1=new StringBuilder(str);
        sb.append("hello");//拼接
    }

    public static void main3(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("捕获到了算数异常");
        }
        System.out.println("hhhhhh");
    }

    public static void main4(String[] args) {
        int[] arr={1,2,3};
        System.out.println("before");
        System.out.println(arr[100]);
        System.out.println("after");
    }

    public static void main5(String[] args) {
        int[] arr={1,2,3};
        try{
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    public static void main6(String[] args) {
        int[] arr={1,2,3};
        try{
            System.out.println("before");
            arr=null;
            System.out.println(arr[100]);
            System.out.println("after");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    public static void main7(String[] args) {
        int[] arr={1,2,3};
        try{
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally{
            System.out.println("finally code");
        }
    }

    public static void func() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {

    }
}

