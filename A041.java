package day6_8;

import java.util.Scanner;

public class A041 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a= new int[9];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int x=8;
		int b=0;
		int t=0;
		for(int i=0;i<a.length;i++) {
			int y=0;
			for(int j=i;j<a.length;j++) {
				y+=a[j];
				if(y==x&&(j-i+1)>b) {
					b=j-i+1;
					t=i;
					continue;
				}
			}
		}
		System.out.println(t+" "+(t+b-1));
	}
}
