package kr.java.chapter3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan ;
		int i = 1;
		
		System.out.println("단을 입력해 주세요:");
		dan =sc.nextInt();
		
		while( i < 10) {
			System.out.println( dan + " * " + i + " = " + i * dan);
			i++; 
			
		}

	}

}
