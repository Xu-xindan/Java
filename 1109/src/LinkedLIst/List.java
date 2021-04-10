package LinkedLIst;

public interface List {
    boolean add(Integer e);
    void add(int index,Integer e);

    Integer remove(int index);
    boolean remove(Integer e);

    Integer get(int index);
    Integer set(int index,Integer e);

    int size();
    void clear();
    boolean isEmpty();

    boolean contains(Integer e);
    int indexOf(Integer e);
    int lastIndexOf(Integer e);
}
