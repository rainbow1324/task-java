package kr.java.chapter3;

public class IfStatementExam {

	public static void main(String[] args) {
		
		int age = 10;
		
		//조건1
		if( age >= 8) { // 조건식!
			System.out.println("8살 이상이네요.");
		}
		else { // 조건이 false 인경우.
			System.out.println("8살 이하!!!");
		}
		
		// 복합 조건;
		
		int age2 = 10;
		// 8살 이상이고 10 보다 큰거.
		if((age >= 8) && (age2 >10))
		{ // 조건식!
			System.out.println("8살 이상이네요.");
		}
		else { // 조건이 false 인 경우.
			System.out.println("8살 이하!!!");
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
