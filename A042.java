package day6_8;

import java.util.ArrayList;
import java.util.List;

public class A042 {
	public static void main(String[] args) {
		int[]a= {9,6,8,3,7};
		int[]b= new int[5];
		int max1=0,max2=0,x=0,y=0;
		for(int i=0;i<a.length;i++) {
			max1=Math.max(max1, a[i]);
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==max1)x=i;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=max1&&max2!=max1) {
				max2=Math.max(max2, a[i]);
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==max2)y=i;
		}
		System.out.println(x+" "+y);
		List<Integer> k=new ArrayList<Integer>();
		b[1]=a[Math.min(x, y)];b[3]=a[Math.max(x, y)];
		for(int j=0;j<b.length;j++) {
			if(j!=x&&j!=y) {
				k.add(b[j]);
			}
		}
		for(int i=0;i<k.size();i++) {
			System.out.print(k.get(i));
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
