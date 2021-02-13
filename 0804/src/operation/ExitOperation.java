package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 退出系统
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:33
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
