package dui;

import java.util.NoSuchElementException;

public interface Queue {

    //插入 true成功 false失败（容量满了）
    boolean offer(Integer e);

    //看队首元素但不删除
    Integer peek();

    //返回并删除队首元素
    Integer poll();

    //以下通过抛出异常通知错误
    //插入 永远返回true插入
    default boolean add(Integer e){
        if(offer(e)==false){
            throw new IllegalStateException();
        }
        return true;
    }

    //看队首元素但不删除
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

