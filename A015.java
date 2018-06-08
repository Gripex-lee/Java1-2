package day5_30;
import java.util.Scanner;
public class A015 {		
	public static int rank(int low,int high,int key,int x[]) {   
	    while(low<=high)  {
	        int mid=low+(high-low)/2;
	        if(low==high) {
	        	return mid;
	        }
	        if(x[mid]>key){
	        	rank(low,mid-1,key,x);
	        }else if(x[mid]<key){
	        	rank(mid+1,high,key,x);  
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		System.out.println(rank(0,a.length,b,a));
	}
}
