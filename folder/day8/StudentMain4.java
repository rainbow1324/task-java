package ex.day8;

import java.util.Scanner;

public class StudentMain4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		Student3 [] students = new Student3[2];
		
		students[0] = new Student3();
		students[1] = new Student3();

		students[0].studentName ="홍길동";
		students[0].grade = 3;
		students[0].subj = new Score3[2];
		students[0].subj[0] = new Score3();
		students[0].subj[0].subject = "수학";
		students[0].subj[0].score = 100;
		students[0].subj[0]= new Score3();
		students[0].subj[0].subject = "과학";
		students[0].subj[0].score = 90;
		students[0].subj[0].subject = "영어";
		students[0].subj[0].score = 90;
		
		
		students[0].studentName ="고길동";
		students[0].grade = 3;
		students[0].subj = new Score3[2];
		students[0].subj[0] = new Score3();
		students[0].subj[0].subject = "수학";
		students[0].subj[0].score = 70;
		students[0].subj[0]= new Score3();
		students[0].subj[0].subject = "국어";
		students[0].subj[0].score = 80;
		students[0].subj[0].subject = "영어";
		students[0].subj[0].score = 90;

		System.out.println("이름 :");

	}

}
