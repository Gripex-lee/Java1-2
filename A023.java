package day5_30;
import java.util.Scanner;
public class A023 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		int num=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				num+=1;
			}
		}
		if(num==0) {
			System.out.println("Element not found in the array");
		}else {
			System.out.println("Element "+b+" occurs "+num);
		}
	}
}
