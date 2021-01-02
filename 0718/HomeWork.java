
import java.util.Random;
import java.util.Scanner;

public class HomeWork{
	public static void main(String[] args) {
		int count =3;
		Scanner scan =new Scanner(System.in);
		while(count !=0){
			System.out.println("请输入你的密码");
			String password=scan.nextline();
			if(password.equals("123")){
				System.out.println("登陆成功");
				break;
			}else{
				count--;
				System.out.println("密码错误");
			}
		}
	}
	public static void main11(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个数：");
		int x=sc.nextInt();
		System.out.print("奇数序列为：");
		for(int i=31;i>1;i=i-2){
			System.out.print((x>>i)&1);
		}
		System.out.print("偶数序列为：");
		for(int i=30;i>2;i=i-2){
			System.out.print((x>>i)&1);
		}
	}
	public static void main12(String[] args) {
		Scanner scan =new Scanner(System.in);
		Random rnd=new Random();
		int random=rnd.nextInt(9999)+1000;
		int i=1;
		while(i<=3){
			System.out.println("请输入密码：");
			int n=scan.nextInt();
			if(n==random){
				System.out.println("登陆成功");
				i++;
			}else{
				i++;
			}
		}
	}
	public static void main10(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个数：");
		int x=sc.nextInt();
		int sum=0;
		for(int i=0;i<32;i++){
			if(((x>>i)&1)==1){
				sum++;
			}
		}
		System.out.println("它的二进制中1的个数为："+sum);
	}
	public static void main9(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个数：");
		int x=sc.nextInt();
		System.out.println("请输入另一个数：");
		int y=sc.nextInt();
		if(x<y){
			int z=x;
			x=y;
			y=z;
		}
		int i=x%y;
		while(i!=0){
			x=y;
			y=i;
			i=x%y;
		}
		System.out.println("最大公约数是"+y);
	}
	public static void main14(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个数：");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
			   System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
	public static void main13(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个整数：");
		int a=sc.nextInt();
		while(a>0){
			int b=a%10;
			System.out.println(b);
			a=a/10;
		}
	}
	public static void main8(String[] args) {
		double sum=0;
		for(double i=1.00;i<=100.00;i=i+2){
			sum=sum+(1/i)-1/(i+1);
		}
		System.out.println("sum="+sum);
	}
	public static void main7(String[] args) {
		for(int num=100;num<=999;num++){
			int a=num/100;
		    int b=num/10%10;
		    int c=num%10;
		    if(num==a*a*a+b*b*b+c*c*c){
		    	System.out.println(num);
		    }
		}
	}
	public static void main6(String[] args) {
		Random random =new Random();
		Scanner sc =new Scanner (System.in);
		int toGuess=random.nextInt(100);
		while(true){
			System.out.println("请输入你猜的数字：（1-100）");
			int num=sc.nextInt();
			if(num<toGuess){
				System.out.println("猜小了");
			}else if(num>toGuess){
				System.out.println("猜大了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}
		sc.close();
	}
	public static void main5(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个年龄：");
		int age=sc.nextInt();
		if(age<=18){
			System.out.println("少年");
		}else if(age<=28){
			System.out.println("青年");
		}else if(age<=55){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	}
	public static void main4(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入一个数：");
		int i=sc.nextInt();
		for(int j=2;j<i;j++){
			if(i%j==0){
				System.out.println(i+"不是素数");
				break;
			}
			if(j==i-1){
				System.out.println(i+"是素数");
			}
		}
	}
	public static void main3(String[] args) {
		for(int num=2;num<=100;num++){
			for(int i=2;i<=num;i++){
				if((num%i)==0){
					break;
				}
				if(i==num-1){
					System.out.println(num);
				}
			}
		}
	}
	public static void main2(String[] args) {
		for(int year=1000;year<=2000;year++){
			if(year%100==0){
				if(year%400==0){
					System.out.println(year);
				}else{}
			}else if(year%4==0){
				System.out.println(year);
			}
		}
	}
	public static void main1(String[] args) {
		int ret=0;
		for(int i=1;i<=100;i++){
			if(i%10==9){
				ret++;
			}
		    if(i/10==9){
		    	ret++;
		    }
	    }
	System.out.println("ret="+ret);
    }
}