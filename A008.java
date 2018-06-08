package day5_29;
import java.util.Scanner;
public class A008 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[] a=new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		br.close();
		for(int i=0;i<6;i++) {
			for(int j=i;j<6;j++) {
				if((a[i]>=10&&a[j]>=10&&a[i]<a[j])||
						(a[j]<10&&a[i]<10&&a[i]<a[j])||
						(a[j]<10&&a[i]>=10&&(a[i]/10)<a[j])||
						(a[j]>=10&&a[i]<10&&a[i]<(a[j]/10))||
						(a[j]<10&&a[i]>=10&&(a[i]/10)==a[j])&&(a[j]>a[i]-10*(a[i]/10))) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"");
		}
	}
}
