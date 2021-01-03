

public class TeseDemo{
	public static int add(int a,int b){
		int ret=a+b;
		return ret;
	}
	public static int facSum(int num){
		int sum=0;
		for(int i=1;i<=num;i++){
			int ret=1;
			for(int j=1;j<=i;j++){
				ret *=j;
			}
			sum +=ret;
		}
		return sum;
	}
	public static void main(String[] args) {
		//add(12,33);
		int x=12;
		int y=33;
		add(x,y);
	}
}