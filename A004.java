package day5_26;
import java.util.Arrays;
import java.util.Scanner;
public class A004 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a=new int[8];
		for(int i=0;i<8;i++) {
			a[i]=br.nextInt();
		}
		br.close();//输入
		
		Arrays.sort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
}
