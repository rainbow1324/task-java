package kr.java.chapter3;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {
		
		// 실습:
		// 숫자가 0, 부호 -가 아니면 숫자를 출력!
		// 0, 부호 -면 경고 메시지 "양수를 입력하세요!" 출력!
		//종료
		
		// Scanner, if statement 사용:
					
			
			Scanner scanner = new Scanner(System.in);
		
			
			System.out.println(11);
//			String a = scanner.nextLine();
//			
//			int num1 = Integer.parseInt(a);
			
			int num1=scanner.nextInt();
			
			if((num1 == 0) || ( num1 < 0)) {
				System.out.println("양수를 입력하세요");
			}
			else { // 조건이 false 인 경우.
				System.out.println("숫자"+ num1);
			}
		}

}
