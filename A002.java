package day5_26;
import java.util.Scanner;
public class A002 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[7];
		for(int i=0;i<7;i++) {
			a[i]=br.nextInt();
		}
		br.close();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
