/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/11
 * TIME:20:27
 */
import java.util.Comparator;

class ByHeightComparator implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1,Teacher o2){
        return o1.height-o2.height;
    }
}

class ByWeightComparator implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1,Teacher o2){
        return o1.weight-o2.weight;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher("gaobo",18,190,80);
        Teacher t2=new Teacher("chenpeixin",19,180,100);

        Comparator<Teacher>byHeight=new ByHeightComparator();
        Comparator<Teacher>byWeight=new ByWeightComparator();

        int r;
        //自然顺序 即设置的年龄
        r=t1.compareTo(t2);
        System.out.println(r);
        //按照身高
        r=byHeight.compare(t1,t2);
        System.out.println(r);
        //按照体重
        r=byWeight.compare(t1,t2);
        System.out.println(r);
    }

}
