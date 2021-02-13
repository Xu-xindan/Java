package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:45
 */
abstract public class User {
    protected String name;
    protected IOperation[] iOperations;//存储当前对象所有的操作

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
        this.iOperations[choice].work(bookList);
    }
}
