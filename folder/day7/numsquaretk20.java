package kr.day7;

import java.util.Scanner; //강명진씨 코드

public class numsquaretk20 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("수를 입력하시오.");
	int n = sc.nextInt();
	int num = 1;
	
	int[][] arr = new int[n][n];
	
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{	
				arr[i][j] = num;
				num = num+2;
				if(num > 10)
					num = 1;
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

}

}
