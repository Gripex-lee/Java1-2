package day5_26;
import java.util.Arrays;
import java.util.Scanner;
public class A0006 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a=new int[6];
		for(int i=0;i<6;i++) {a[i]=br.nextInt();}
		br.close();
		Arrays.sort(a);
		int cha=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]-a[i-1]>cha) {
				cha=a[i]-a[i-1];
			}
		}
		for(int i=0;i<a.length;i++) {System.out.print(a[i]+" ");}
		System.out.println();
		System.out.println(cha);
	}
}
