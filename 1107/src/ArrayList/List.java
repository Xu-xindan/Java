package ArrayList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/7
 * TIME:12:37
 */
public interface List {
    boolean add(Integer e);
    void add(int index,Integer e);

    //根据下标删除
    int remove(int index);
    //删除第一个遇到的
    boolean remove(Integer element);

    Integer set(int index,Integer e);
    Integer get(int index);

    int size();
    void clear();
    boolean isEmpty();

    boolean contains(Integer e);
    int indexOf(Integer e);
    int lastIndexOf(Integer e);

}
