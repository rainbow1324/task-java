package kr.java.chapter3;

public class IfExample3 {

	public static void main(String[] args) {
	
		int num = -3;
		
		if(num > 0) {
			System.out.println("양수");
		}
		else if(num < 0) {
			System.out.println("음수");
		}
		else{
			System.out.println("0입니다.");
		}
		
	}

}
