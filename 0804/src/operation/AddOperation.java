package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 新增图书
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:31
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("新增图书");
        System.out.println("请输入图书的名字:");
        String name = sc.next();
        System.out.println("请输入图书的作者:");
        String author = sc.next();
        System.out.println("请输入图书的价格:");
        int price = sc.nextInt();
        System.out.println("请输入图书的类型:");
        String type = sc.next();
        Book book = new Book(name,author, price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setBook(currentSize,book);
        bookList.setUsedSize(currentSize+1);
        System.out.println("添加成功！");
    }
}
