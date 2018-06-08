package day5_30;

import java.util.Scanner;
public class A019 {
	public static int Ternary_search(int key,int x[]) {  
	    int low=0;  
	    int high=x.length-1;  
	    int notFind=-1;  
	    while(low<=high) {
	        int mid1=low+(high-low)/3;
	        int mid2=mid1+(high-low)/3;
	        if(key<x[mid1]){
	            high=mid1-1;  
	        }else if(x[mid2]<key){
	            low=mid2+1;  
	        }else if(key>x[mid1]&&key<x[mid2]) {
	        	high=mid2-1;
	        	low=mid1+1; 
	        }else if(key==x[mid1]){
	            return mid1;  
	        }else {
	        	return mid2;
	        }
	    }
	    return notFind;  
	}
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		int y=Ternary_search(b,a);
		if(y==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index "+y);
		}
	}
}
