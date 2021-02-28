package int_type;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/20
 * TIME:09:05
 */
public class ArrayListIterator implements Iterator{
    private ArrayList list;
    private int index;

    ArrayListIterator(ArrayList list){
        this.list=list;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<list.size();
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public void remove() {

    }
}
