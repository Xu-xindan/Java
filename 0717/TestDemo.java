
public class TestDemo{
	public static void main(String[] args) {
		// int i=10;
		// i=i++;
		// System.out.println(i);
		int a=-1;
		System.out.println(a>>2);
	}
	public static void main5(String[] args) {
		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println((float)5/2);
		System.out.println(5/(float)2);
	}
	public static void main4(String[] args) {
		int a=10;
		String str=a+"";
		String str2=String.valueOf(a);
		System.out.println(str2);
		//字符串转化为整形
		String num="123";
		int ret=Integer.parseInt(num);
	}
	public static void main3(String[] args) {
		int a=1;
		long b=20;
		//int c=a+b;//a提升为long再运算 结果c为long类型
		int c=(int)(a+b);//强转
		System.out.println(c);
	}
	public static void main2(String[] args) {
		int a=10;
		long b=20;
		//a=b;//错误
		a=(int)b;//强转可以
		b=a;//小类型赋值给大类型可以
	}
	public static void main1(String[] args) {
		int a=10;//变量
		a=80;
		int c=a+20;
		System.out.println("c的值为"+c);
		final int b=20;//常量
		int d=b+89;
		System.out.println("d的值为"+d);
	}
}