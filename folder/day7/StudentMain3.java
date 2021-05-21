package kr.day7;

public class StudentMain3 {

	public static void main(String[] args) {
		//Student2, Score2 이용.
		// -- subj -> 배열.
		
		// 홍길동/구로구/3, 수학 100, 국어 90
		//고길동/영등포구/3, 수학 70, 국어 80
		
		
		Student2 [] students = new Student2[2];
		
		students[0] = new Student2();
		students[1] = new Student2();

		students[0].studentName ="홍길동";
		students[0].grade = 3;
		students[0].subj = new Score2[2];
		students[0].subj[0] = new Score2();
		students[0].subj[0].subject = "수학";
		students[0].subj[0].score = 100;
		students[0].subj[0]= new Score2();
		students[0].subj[0].subject = "국어";
		students[0].subj[0].score = 90;
		
		
		

		
		students[0].studentName ="고길동";
		students[0].grade = 3;
		students[0].subj = new Score2[2];
		students[0].subj[0] = new Score2();
		students[0].subj[0].subject = "수학";
		students[0].subj[0].score = 70;
		students[0].subj[0]= new Score2();
		students[0].subj[0].subject = "국어";
		students[0].subj[0].score = 80;
		
		
		
		
		/*for(int i = 0; i<5; i++) {
			System.out.println(students[i]);
			System.out.println(students[i].studentName);
			System.out.println(students[i].address);
			System.out.println(students[i].grade); */
		
		
		
		
		for(int i = 0; i< students.length; i++) {
			Student2 student = students[i];
			System.out.println(student.studentName + student.grade );
		}
		
		for(Student2 student : students) {
			System.out.println(student.studentName);
		}
		


	}
	}

