package linkedlist;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/20
 * TIME:10:10
 */
public interface List extends Iterable{
    boolean add(Integer e);
    void add(int index,Integer e);
    Integer remove(int index);
    boolean remove(Integer e);
    Integer get(int index);
    Integer set(int index,Integer e);
    int size();
    void clear();
    boolean contains(Integer e);
    int indexOf(Integer e);
    int lastIndexOf(Integer e);
}
