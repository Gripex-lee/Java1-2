package day5_30;
import java.util.Scanner;
public class A024 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int x=br.nextInt();
		br.close();
		int floor=0,ceil=0;
		//插入排序
		for(int i=0;i<a.length-1;i++) {
			if(x==a[i]) {
				floor=a[i];
				ceil=a[i];
			}else if(x<a[i+1]&&x>a[i]) {
				floor=a[i];
				ceil=a[i+1];
			}
		}
		System.out.println(ceil+" "+floor);
	}
}
