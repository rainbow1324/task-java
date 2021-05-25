package kr.java.chapter5.constructor;

public class CircleTest {

	public static void main(String[] args) {

		
		
		
		Circle c1 = new Circle("피자" , 10.0);
		Circle c2 = new Circle("도넛", 2.0);
		
		System.out.println( c1.name + ":" + c1.getArea());
		System.out.println( c2.name + ":" + c2.getArea());
		
	}

}
