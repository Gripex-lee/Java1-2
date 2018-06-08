package day5_30;

import java.util.Scanner;

public class A018 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[9];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		int y=-1;
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				y=i;
			}
		}
		if(y!=-1) {
			System.out.println("Element "+b+" found at index "+y);
		}else {
			System.out.println("Element not found in the array");
		}
	}
}
