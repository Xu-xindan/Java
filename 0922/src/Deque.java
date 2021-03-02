import com.sun.imageio.plugins.common.I18N;

import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/22
 * TIME:19:45
 */
public interface Deque extends Queue {
    boolean offerFirst(Integer e);
    Integer peekFirst();
    Integer pollFirst();

    void offerLast(Integer e);
    Integer peekLast();
    Integer pollLast();

    default void addFirst(Integer e){
        if(offerFirst(e)==false){
            throw new IllegalStateException();
        }
    }

    default Integer getFirst(){
        Integer e=peekFirst();
        if(e==null){
            throw new NoSuchElementException();
        }
        return e;
    }

    default Integer removeFirst(){
        Integer e=pollFirst();
        if(e==null){
            throw new NoSuchElementException();
        }
        return e;
    }

    default void push(Integer e){
        addFirst(e);
    }
}
