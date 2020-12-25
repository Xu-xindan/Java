import java.util.Scanner;

public class HomeWork {

	public static void main1(String[] args) {
		int a=10;
		int b=20;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a="+a+",b="+b);
	}
	public static void main2(String[] args) {
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
			if(c&1 == 1){
				count++;
				c>>1;
			}else{
				c>>1;
			}
		}
		return count;
	}

	public static int find(int[] array,int key){
		int a=0;
		int b=array.length-1;
		while(a!=b){
			if(array[a]+array[b]>key){
				b--;
			}
			if(array[a]+array[b]<key){
				a++;
			}
		    if(array[a]+array[b]==key){
		    	break;
		    }
		}
		return array[a],array[b];
	}
	public static void least(int[] arr,int k){
		for(int i=0;i<k;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<k;i++){
			System.out.print(arr[i]);
		}
	}

	public static int findhalf(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int count=0;
			for(int j=1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>arr.length)
				return arr[i];
		}
		return 0;
	}

	public static int[] findNum(int[] arr){
		if(arr.length<2){
			return arr;
		}
		int[] result=new int[2];
		int res=arr[0];
		for(int i=0;i<arr.length;i++){
			res ^=arr[i];
		}
		int bitIndex=0;
		for(int i=0;i<32;i++){
			if((res>>i&1)==1){
				bitIndex=i;
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			if((arr[i]>>bitIndex&1)==1)
			    result[0]^=arr[i];
		    else
		    	result[1]^=arr[i];
	    }
	    return result;
	}
}