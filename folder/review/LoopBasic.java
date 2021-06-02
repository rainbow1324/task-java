package ch04;

public class LoopBasic {

	public static void main(String[] args) {
		
		// while(조건식) { 코드블럭 }
		
		// 1~10 자연수를 각각 더해서 합을 출력.
		
		// do while
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) { //num 증가 + 1
			sum = num +sum;
			//sum += num;
			
			// 마지막
			// ++num;
			// num = num +1;
			// num +=1;
			// 후위
			 num++;
			
		}
		System.out.println("1...10까지 합:" + sum);
		
		// 1..10까지 수에서 짝수인 경우만 함.
		
		num = 1;
		while(num <= 10) {
			//짝수인지?
			if( num % 2 == 0) {
				sum+= num;
			}
			// 마지막
			num++;
		}
		
		// while -> Loop 만들때 거의 사용!
		
		//while(true) {
			// 무한루프라 끝낼 조건이 필요...
		//}
		
		
		// do while
		
		
		num = 1;
		sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num > 2);
		
		System.out.println("1...10까지 합: " + sum );
		
		// for
		// for( 초기화식; 조건식; 증감식) {크드블럭}
		// for( ; 조건식; 증감식) {크드블럭}
		// for( ; ; 증감식) {크드블럭}
		// for( 초기화식; 조건식; ) {크드블럭}
		// for( ; ; ) {크드블럭}
		// ---> while()
		
		// 각각의 index++
		
		
		//int num2;
		for(int num2 = 1; num2 <= 5; num2++) {
			
		}
		// 문자형 a-z 출력하시오.
		char ch;
		for(int c = 63; c < 90 ; c++) {
			System.out.println((char)c);
		}
		
		sum = 0;
		for(int num3 =1 ; num3 <= 10; num3++) {
			//짝수인지?
			if( num3 %2 ==0) {
				sum += num3;
			}
			
		}
		for(byte b = 0; b < 127; b++) {
			
		}
		for(float f = 0; f < 100.0; f++) {
			
		}
		
		//중첩된 반복문!
		while(num <10) {
			while(num%2 == 0) {
				
			}
			num++;
		}
		
		for(int d =2; d <= 9; d++) {
			for(int i =1; i <=9; i++) {
				//System.out.println(d*i);
				System.out.println(d + "x"+ i+ "="+ (d * i));
				System.out.printf("%d x %d = %d" , d, i, d * i);
			}
		}
		
		// continue
		// 반복중 코드블럭 안에서 어떤 조건인 경우 처음 반복으로 돌아가는 것.
		//1...100 사이 홀수만 합!
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			// 짝수 -> 다시 반복으로 돌아감.
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		
		// break;
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			// 짝수 -> 다시 반복으로 돌아감.
			if(i == 55) {
				break;
			}
			sum += i;
		}
		
		
		
		
		
		
		
		// for each 향상된 for문
		// - 컬렉션 객체 자체.
		// for (element(요소): 컬렉션 ) {코드블럭}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// for
		
		// for each

		
	}

}
