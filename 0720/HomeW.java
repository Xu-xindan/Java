import java.util.Scanner;

public class HomeW{
	public static int fac(int n){
		int ret=1;
		for(int i=1;i<=n;i++){
			ret*=i;
		}
		return ret;
	}
    public static int max2(int a,int b){
    	int ret;
    	return ret=a>b?a:b;
    }
    public static int max3(int a,int b,int c){
    	int m=max2(a,b);
    	int ret=max2(m,c);
    	return ret;
    }
    public static int fib(int n){
    	int ret=1;
    	if(n==1||n==2){
    		ret=1;
    	}
    	int a=1;
    	int b=1;
    	for(int i=3;i<=n;i++){
    	    ret=a+b;
    		a=b;
    		b=ret;
    	}
    	return ret;
    }
    public static void main(String[] args) {
    	int arr[]={7,3,5,8,1,5,44,53,76};
    	int i,j;
    	for(i=0;i<arr.length;i++){
    		for(j=i+1;j<arr.length;j++){
    		if(arr[i]%2==0){
    			int t=arr[i];
    			arr[i]=arr[j];
    			arr[j]=t;
    		}
    	}
    	}
    	for(i=0;i<arr.length;i++){
    		System.out.println(arr[i]);
    	}
    }
    public static void main5(String[] args) {
    	int arr[]={1,2,3,4,1,2,3,4,6};
    	for(int i=0;i<arr.length;i++){
    		int j=0;
    		for(;j<arr.length;++j){
    			if(arr[i]==arr[j]&&i!=j){
    				break;
    			}
    		}
    		if(j==arr.length){
    			System.out.println(arr[i]);
    		}
    	}
    }
    public static void main4(String[] args) {
    	Scanner sc= new Scanner(System.in);
		System.out.println("请输入n");
		int n=sc.nextInt();
		int result =fib(n);
		System.out.println("斐波那契数的第"+n+"项为"+result);
    }
    public static void main3(String[] args) {
    	Scanner sc= new Scanner(System.in);
		System.out.println("请输入你要比较的三个数");
		int x=sc.nextInt();
		//System.out.println("请输入另一个数");
		int y=sc.nextInt();
		int z=sc.nextInt();
		int Max=max3(x,y,z);
		System.out.println(Max);
    }
	public static void main2(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入n");
		int n=sc.nextInt();
		int result=0;
		for(int i=1;i<=n;i++){
			result+=fac(i);
		}
		System.out.println(result);
	}
	public static void main1(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入n");
		int n=sc.nextInt();
		int result=fac(n);
		System.out.println("n 的阶乘为"+result);
	}
}