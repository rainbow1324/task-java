package kr.java.chapter3;

public class Test1 {

	public static void main(String[] args) {

		int score =35;
		char grade;
		
		if(score >=90) {
			System.out.println("A" + "grade");
		}
		else if(score >=80) {
			System.out.println("B" + "grade");
		}
		else if(score >= 70) {
			System.out.println("C" + "grade");
		}
		else if(score >= 60) {
			System.out.println("D" + "grade");
		}
		else {
			System.out.println("F" + "grade");
		}
	}

}
