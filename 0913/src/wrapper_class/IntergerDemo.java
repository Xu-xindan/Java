package wrapper_class;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/13
 * TIME:10:26
 */
public class IntergerDemo {
    public static void main1(String[] args) {
        int a=100;
        System.out.println(a);
        /*Integer aBox=a;
        System.out.println(a);*/
        Integer aBox=new Integer(a);
        System.out.println(aBox);

    }

    public static void main(String[] args) {
        Integer aBox=100;
        int a=aBox.intValue();
        int b=aBox;
        if(aBox>1000){//aBOx.intvalue>1000

        }
        Integer.valueOf("1024");
        Integer.valueOf("20",8);//用八进制表示20
        Long.toHexString(19);//十六进制表示19
        Long.toOctalString(19);//八进制表示19
    }
}
