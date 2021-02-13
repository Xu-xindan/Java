import book.BookList;
import user.AdminUser;
import user.NorUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/8/4
 * TIME:09:53
 */
public class Main {
    public static User login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name=sc.next();
        System.out.println("请输入你的身份:1-》管理员 0-》普通用户");
        int n=sc.nextInt();
        if(n==1){
            return new AdminUser(name);
        }else{
            return new NorUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();//向上转型
        while(true){
            int choice=user.menu();//动态绑定
            user.doOperation(choice,bookList);
        }
    }
}
