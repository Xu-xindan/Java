package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 查找图书
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:34
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner sc=new Scanner(System.in);
        System.out.println("查找图书");
        System.out.println("请输入查找图书的名称");
        String name=sc.next();

        for(int i=0;i<bookList.getUsedSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("查找到了！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有此书籍");
    }
}
