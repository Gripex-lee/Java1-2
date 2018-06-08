package day6_1;
import java.util.Scanner;
public class A026 {
	public static void main(String[] args) {  
        int[] a = new int[7];
        Scanner br=new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
        	a[i]=br.nextInt();
        }
        br.close();
        int[] s = getMaxSummary(a, 0, 6);  
        System.out.println(s[2]); 
    }
    public static int[] getMaxSummary(int[] A, int low, int high) {  
        if (low == high) { // 一个元素直接返回 
            int[] result = {low, high, A[low]};  
            return result;
        } else {
            int middle = (int) Math.floor((low + high) / 2); // 获取中间值  
            int[] left = new int[3]; // 保存左边部分返回结果  
            int[] right = new int[3]; // 保存右边部分返回结果  
            int[] cross = new int[3]; // 返回交叉部分返回结果  
            left = getMaxSummary(A, low, middle);
            right = getMaxSummary(A, middle + 1, high); 
            cross = getMaxCrossMid(A, low, high, middle);  
            if (left[2] >= right[2] && left[2] >= cross[2]) {//那部分大就用了那部分  
                return left;
            } else if (right[2] >= left[2] && right[2] >= cross[2]) {  
                return right;
            } else {
                return cross;  
            }  
        }  
    }
    public static int[] getMaxCrossMid(int[] A, int low, int high, int middle) {  
        int leftSum = Integer.MIN_VALUE;  
        int sum = 0; // 保存和的  
        int left = 0; // 记录左边位置  
        for (int i = middle; i >= low; i--) {  
            sum = sum + A[i];  
            if (sum > leftSum) { // 证明所加数字为正数，那么符合条件（因为最大子数组内正数越多指定越大）  
                leftSum = sum;  
                left = i;  
            }  
        }
        int rightSum = Integer.MIN_VALUE;  
        int sum2 = 0;  
        int right = 0; // 记录右边位置  
        for (int i = middle + 1; i <= high; i++) {  
            sum2 = sum2 + A[i];  
            if (sum2 > rightSum) {  
                rightSum = sum2;  
                right = i;  
            }  
        }
        int[] result = new int[3];  
        result[0] = left;  
        result[1] = right;  
        result[2] = leftSum + rightSum;  
        return result;  
    }
}
