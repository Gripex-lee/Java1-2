package day5_30;

import java.util.Scanner;
public class A022 {
	public static int find(int[] a,int key){
        int left = 0;
        int right = a.length-1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (key == a[mid]) {
                return mid;
            }
            if (a[left]<=a[mid]) {
                if (key<a[mid] && key>=a[left]) {
                    right = mid-1;
                 }else {
                    left = mid+1;
                }
            }else if (a[left]>a[mid]) {
                if (key<a[left] && key>a[mid]) {
                    left = mid + 1;
                }else {
                    right= mid - 1;
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int[]a= new int[6];
		for(int i=0;i<a.length;i++) {
			a[i]=br.nextInt();
		}
		int b=br.nextInt();
		br.close();
		int y=find(a,b);
		if(y==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index "+y);
		}
	}
}
