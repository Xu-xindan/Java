package dui;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.NoSuchElementException;

public interface Deque extends Queue {
    //通过特殊报错
    boolean offerFirst(Integer e);
    Integer peekFirst();
    Integer pollFirst();

    boolean offerLast(Integer e);
    Integer peekLast();
    Integer pollLast();

    //通过异常报错
    default void addFirst(Integer e){
        if(offerFirst(e)==false){
            throw new IllegalStateException();
        }
    }
    default Integer getfirst(){
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
}
