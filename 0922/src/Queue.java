import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/9/22
 * TIME:19:08
 */
public interface Queue {
    //永远返回true
    boolean offer(Integer e);

    Integer peek();

    Integer poll();

    //插入  返回true
    default boolean add(Integer e){
        if(offer(e)==false){
            throw new IllegalStateException();
        }
        return true;
    }

    //看队首元素，但不删除
    default Integer element(){
        Integer e=peek();
        if(e==null){
            throw new NoSuchElementException();
        }
        return e;
    }

    //返回并删除队首元素
    default Integer remove(){
        Integer e=poll();
        if(e==null){
            throw new NoSuchElementException();
        }
        return e;
    }


}
