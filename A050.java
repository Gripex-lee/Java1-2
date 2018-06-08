package day6_8;



public class A050 {
	public static void main(String[] args) {
		String str="We provide good material for IT Technical Interview preparation";
		String[]a=str.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
