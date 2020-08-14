public class HomeWork {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a+",b="+b);
	}
	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c=20;
		int m=a>b?a:b;
		int max=m>c?m:c;
		int n=a<b?a:b;
		int min=n<c?n:c;
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

	public static int Count(int c){
		int count=0;
		for(int i=0;i<32;i++){
			if(c&1==1){
				count++;
				c>>1;
			}else{
				c>>1;
			}
		}
		return count;
	}
}