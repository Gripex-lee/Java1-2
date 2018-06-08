package day5_30;

public class A014 {
	public static int fun(int n) {
		if(n==1) {
			return 10;
		}else
		return fun(n-1)+2;
	}
	public static void main(String[] args) {
		int n=5;
		System.out.println("第五个人的年龄是"+fun(n));
	}
}
