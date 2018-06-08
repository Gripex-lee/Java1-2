package day5_30;

public class A013 {
	//n为天数
	public static int fun(int n) {
		if(n==1) {
			return 1;
		}else
		return 2*(fun(n-1)+1);
	}
	public static void main(String[] args) {
		int n=30;
		System.out.println(fun(n));
	}
}
