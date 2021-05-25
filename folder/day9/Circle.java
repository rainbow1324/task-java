package kr.java.chapter5.constructor;

public class Circle {
	
	
	String name;
	double radius;

	
	
	
	public Circle(String n , double r) {
		name = n;
		radius =r;
	}

		public double getArea() {
			double result =radius*radius *3.14;
			return result;
}
}
