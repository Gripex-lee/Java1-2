package day5_29;
import java.util.Scanner;
public class A016 {
	public static int func(int x,int n) {
		if(n==1) {
			return x;
		}else if(n==2){
			return x*x;
		}else if(n%2==0){
			return func(x,n/2)*func(x,n/2);
		}else {
			return func(x,(n-1)/2)*func(x,(n-1)/2+1);
		}
	}
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a=new int[2];
		for(int i=0;i<2;i++) {
			a[i]=br.nextInt();
		}
		br.close();
		System.out.println(func(a[0],a[1]));
	}
}
