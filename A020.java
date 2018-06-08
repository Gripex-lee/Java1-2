package day5_30;

import java.util.Scanner;
public class A020 {
	public static int Expon(int key,int x[]) {  
	    int low=0;
	    int high=x.length-1; 
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        if(x[mid]>key){
	            high=mid-1;
	        }else if(x[mid]<key){
	            low=mid+1;
	        }
	        else{
	            return mid;  
	        }  
	    }
	    return -1;  
	}
	
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[11];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		double m=Math.log(a.length)/Math.log(2);
		int y=0;
		int z=0;
		for(int i=0;i<(int)m+1;i++) {
			int low;
			int high;
			if(b==a[0]) {
				low=0;
			}else{
				low=(int)Math.pow(2,i);
				}
			if(b==a[a.length-1]) {
				high=a.length-1;
			}else{
				high=(int)Math.pow(2,i+1);;
				}
			int[]t=new int[high-low+1];
			if(b>=a[low]&&b<=a[high]) {
				for(int p=0;p<t.length;p++) {
					t[p]=a[low+p];
				}
			}
			y=Expon(b,t);
			z=low;
		}
		if(y==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index "+(y+z));
		}
	}
}
