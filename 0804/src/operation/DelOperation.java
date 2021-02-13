package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * 删除图书
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:32
 */
public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入你要删除的书籍");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int pos=-1;
        int i=0;
        for(;i<bookList.getUsedSize();i++){
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                pos=i;
                break;
            }
        }
        if(i>=bookList.getUsedSize()){
            System.out.println("没有需要删除的书籍");
            return;
        }
        int curSize=bookList.getUsedSize();
        for(int j=pos;j<bookList.getUsedSize()-1;j++){
            Book book=bookList.getBook(i+1);
            bookList.setBook(i,book);
        }
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功！");
    }
}
