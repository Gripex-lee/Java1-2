package day6_1;
import java.util.Scanner;
public class A027 {
    public static void main(String[] args) {
        new A027().test();  
    } //main方法
    public void test(){ 
        int[] a=new int[6];
        Scanner br=new Scanner(System.in);
        for(int i=0;i<a.length;i++) {
        	a[i]=br.nextInt();
        }
        br.close();//输入
        MinMax mm=getMinMax(a,0,a.length-1);  
        System.out.println("The minimum element in the array is "+mm.getMin());  
        System.out.println("The maximum element in the array is "+mm.getMax());    
    } //test方法    
    public MinMax getMinMax(int[] a,int begin,int end){    
        if(end-begin<=1){  
            if(a[begin]>a[end]){                    
                return new MinMax(a[end],a[begin]);                   
            }else{  
                return new MinMax(a[begin],a[end]);  
            }  
        }else{
            int mid=(begin+end)/2;
            MinMax left=getMinMax(a,begin,mid);  
            MinMax right=getMinMax(a,mid,end);   
            int min=0,max=0;  
            min=left.getMin()>right.getMin()?right.getMin():left.getMin();  
            max=left.getMax()>right.getMax()?left.getMax():right.getMax();   
            return new MinMax(min,max);  
        } //递归函数  
    }
    class MinMax{ 
        private int mMin;  
        private int mMax;
        public MinMax(int min,int max){ 
            mMin=min;  
            mMax=max;  
        }   
        public int getMin(){  
            return mMin;  
        }  
        public int getMax(){
            return mMax;  
        }  
    } //类 
} 
