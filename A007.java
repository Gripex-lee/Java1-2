package day5_26;
import java.util.Arrays;
import java.util.Scanner;
public class A007 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a=new int[8];
		for(int i=0;i<a.length;i++) {a[i]=br.nextInt();}
		br.close();
		int x=0;
		int y=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					x=i;
					break;
				}
			}
			if(x!=0) {break;}
		}
		for(int i=a.length-1;i>=0;i--) {
			for(int j=i-1;j>0;j--) {
				if(a[j]>a[i]) {
					y=i;
					break;
				}
			}
			if(y!=0) {break;}
		}
		System.out.println("Sort array from index "+x+" to "+y);
	}
}	
