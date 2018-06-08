package day6_8;

public class A048 {
	public static void main(String[] args) {
		String str="((w))";
		String pattern1="\\(\\(\\D+\\)\\)";
		String pattern2="\\(.\\)";
		if(pattern1.matches(str)) {
			System.out.println("Duplicate Found");
		}else if(pattern2.matches(str)){
			System.out.println("Duplicate Found");
		}else{
			System.out.println("No Duplicates Found");
		}
	}
}
