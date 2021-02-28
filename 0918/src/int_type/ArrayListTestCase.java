package int_type;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/19
 * TIME:20:42
 */
public class ArrayListTestCase {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.size());

        list.add(0,100);
        System.out.println(list);
        System.out.println(list.size());

        try{
            list.add(-1,300);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(list.remove((Integer) 100));

        System.out.println(list.set(3,2000));

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
