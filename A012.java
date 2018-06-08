package day5_29;

public class A012 {
	public static void main(String[] args) {
		int[]a= {1,2,3,1};
		int x=1;
		for(int i=1;i<a.length;i++) {
			if(a[0]!=a[i]) {
				x+=1;
			}
		}//确定有多少不同的数
		int[]b=new int[x];
		b[0]=a[0];
		for(int i=1;i<a.length;i++) {
			if(b[0]!=a[i]) {
				b[i]=a[i];
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" "+b[i]);
			for(int j=i;j<b.length;j++) {
				if(b[i]!=b[j]) {
					System.out.println(b[i]+" "+b[j]);
				}
			}
		}
	}
}
