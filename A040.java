package day6_8;

import java.util.Scanner;

public class A040 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		br.close();
		for(int i=0;i<a.length;i++) {
			int x=0;
			for(int j=i;j<a.length;j++) {
				x+=a[j];
				if(x==0) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}
}
