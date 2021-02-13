package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 归还图书
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:34
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入你要归还的书籍");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        for(int i=0;i<bookList.getUsedSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
