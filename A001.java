package day5_26;
import java.util.Scanner;
public class A001 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int []a= {3,8,5,4,1,9,2};
		for(int i=0;i<7;i++) {
			a[i]=br.nextInt();
		}
		br.close();
		for(int i=1;i<7;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					for(int k=i;k>=j+1;k--) {
						a[k]=a[k-1];
					}//其他以后的数字后移
					a[j]=temp;//小的数替代原来数
				}
			}
		}
		for(int i:a) {System.out.print(i+" ");}
	}
}
