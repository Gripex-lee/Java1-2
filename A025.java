package day5_31;

import java.util.Scanner;
public class A025 {
	public static int find(int[] x){
        int low = 0;
        int high = x.length-1;
        while(low<=high)  {
	        int mid=low+(high-low)/2;
	        if(x[low]>x[mid]){
	        	high=mid-1;
	        } else if(x[mid]>x[high]){
	            low=mid+1; 
	        }
	        else{
	            return mid-1;  
	        }
	    }
        return low+1;
    }
	public static void main(String[] args) {
/*		Scanner br=new Scanner(System.in);
		int[]a= new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		br.close();*/
		int[]a= {6,8,9,10,2,5};
		System.out.println("The array is rotated "+find(a)+" times");
	}
}
