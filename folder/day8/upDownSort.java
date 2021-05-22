package workfor_3;

import java.util.Scanner;

public class upDownSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int put;
		int number;
		int arr[];
		int temp;
		temp = 0;
		System.out.print("몇개의 숫자를 입력하시겠습니까?");
		put = sc.nextInt();
		
		arr = new int[put];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 숫자 입력");
			arr[i] = sc.nextInt();
		}
		
		//오름차순
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]: "+ arr[i]);
		}

			
		//내림차순
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]: "+ arr[i]);
		}
	}

}
