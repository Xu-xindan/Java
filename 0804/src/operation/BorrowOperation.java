package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 借阅书籍
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:32
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.println("请输入你要借阅的书籍");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        for(int i=0;i<bookList.getUsedSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有这本书!");
    }
}
