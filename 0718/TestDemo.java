
import java.util.Scanner;

public class TestDemo{
	public static void main(String[] args) {
		int num=1;
		int result=0;
		while (num<=5){
		int ret=1;
		int i=1;
		while(i<=num){
			ret *=i;
			i++;
		}
		result+=ret;
		num++;
	}
    System.out.println(result);
}
	public static void main6(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num =scan.nextInt();
		int i=1;
		int odd=0;
		while(i<=num){
			odd+=i;
			i++;
		}
		System.out.println("偶数之和");
	}
	public static void main5(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a =scan.nextInt();
		switch (a){
			case 1:
			System.out.println("1");
			break;
			case 2:
			System.out.println("2");
			break;
			default:
			System.out.println("不是1也不是2");
			break;
		}
	}
	public static void main4(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		if(num>0){
			System.out.println(num+"是正数");
		}else if(num<0){
			System.out.println(num+"是负数");
		}else{
            System.out.println("该数是0");
		}
	}
	public static void main3(String[] args) {
		//int num=8;
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0){
			System.out.println("是偶数");
		}else{
			System.out.println("不是");
		}
	}
	public static void main2(String[] args) {
		int a=10;
		//if(a){//报错
		if(a==10){
			System.out.println("abc");
		}else{
			System.out.println("123");
		}
	}
	public static void main1(String[] args) {
		System.out.println("abcd");
	}
}