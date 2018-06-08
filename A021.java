package day5_30;

import java.util.Scanner;

public class A021 {
	public static int rank(int key,int x[]) {  
	    int low=0;  
	    int high=x.length-1;  
	    int notFind=-1;  
	    while(low<=high)  {
	        //int mid=low+(high-low)/2;二分查找
	    	int mid=low+(high-low)*(key-x[low])/(x[high]-x[low]);//差值查找
	        if(x[mid]>key){
	            high=mid-1;  
	        }else if(x[mid]<key){
	            low=mid+1;  
	        } 
	        else{
	            return mid;  
	        }  
	    }
	    return notFind;  
	}
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		int y=rank(b,a);
		if(y==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index "+y);
		}
	}
}
