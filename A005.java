package day5_28;
import java.util.Scanner;
import java.util.Arrays;
public class A005 {
    public static void sort(int a[],int low,int hight) {
        int i,j,base;
        if (low > hight) {
            return;
        }//保证low<hight
        i = low;
        j = hight;
        base = a[i]; // 用子表索引最小的做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= base)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < base)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = base;// 将基准数值替换回 a[i]
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序
    }

    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Scanner br=new Scanner(System.in);
        int []a=new int[9];
        for(int i=0;i<9;i++) {
        	a[i]=br.nextInt();
        }
        br.close();
        quickSort(a);
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
    }
}
