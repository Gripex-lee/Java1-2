package day5_26;
import java.util.Scanner;
public class A009 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a=new int[9];
		for(int i=0;i<9;i++) {a[i]=br.nextInt();}
		br.close();//输入
		int x=0;
		int y=0;
		for(int i=0;i<9;i++) {
			if(a[i]==0) {x+=1;}else {
				a[y]=a[i];
				y+=1;
			}
		}
		for(int i=0;i<x;i++) {
			a[9-i-1]=0;
		}
		for(int i=0;i<a.length;i++) {System.out.print(a[i]+" ");}
	}
}
