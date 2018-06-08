package day5_29;

import java.util.ArrayList;
import java.util.List;

public class A011 {
	public static void main(String[] args) {
		int[]a= {3,3,1,1,1,8,3,6,8,7,8,6,6,6};	
		//不重复的数字组合b
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
		  if(!list.contains(a[i])) {
		    list.add(a[i]);
		  }
		}
		Integer[] b = list.toArray(new Integer[list.size()]);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}//输出b
		System.out.println();
		int[]c=new int[5];
		int[]s=new int[5];
		//个数
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					c[i]+=1;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		//索引和
/*		System.out.println();
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					s[i]+=j;
				}
			}
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}*/
		//排序
		System.out.println();//换行
		//排出先后输出的数字
		int temp;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length-1-i;j++) {
			if (c[j] < c[j+1]) {
				temp = c[j];
				c[j] = c[j+1];
				c[j+1] = temp;
				temp = b[j];
				b[j] = b[j+1];
				b[j+1] = temp;
			    }
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
				for(int k=0;k<c[i];k++) {
					System.out.print(b[i]+" ");
				}
		}
	}
}
