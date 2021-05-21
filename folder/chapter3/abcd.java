package kr.java.chapter3;

public class abcd {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);
		
		
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result);
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);
		System.out.println(!result);
		
		int a = 8;
		System.out.println(a >>= 2);
		
		
		
		System.out.println("1+1 =" + "결과" + (1+1) );
		System.out.println("유니코드 =" + "\uADAC" );
		System.out.println("유니코드 escape" + "\\uADC");
		System.out.println("정수 + 정수 =" +5 + 10 );
		System.out.println("정수 + 실수 =" +5 +10.9 );
		System.out.println(5 + 10.9 + "= 정수 + 실수");
		
		
		
		
		
		
		
		
		
	}

}
