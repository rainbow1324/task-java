package kr.java.chapter5.constructor;

public class RectangleTest {

	public static void main(String[] args) {

		
		
		Rectangle p = new Rectangle("A" ,20 ,15);
		Rectangle p2 = new Rectangle("B" ,19,18);
		
		
		System.out.println( p.name + ":" + p.getArea());
		System.out.println( p2.name + ":" + p2.getArea());
		
		
		
		
		
	}

}
