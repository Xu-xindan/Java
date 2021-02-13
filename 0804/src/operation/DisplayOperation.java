package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 显示书籍
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:33
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for(int i=0;i<bookList.getUsedSize();i++){
            System.out.println(bookList.getBook(i));
        }
    }
}
