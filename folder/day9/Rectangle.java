package kr.java.chapter5.constructor;

public class Rectangle {
	
	String name;
	float height;
	float width;
	
	public Rectangle(String n , float w , float h) {
		
		name = n;
		height = h;
		width =w;

		System.out.println(name + " : " +
		"w: +width+  h: "+ height);
		
	
	

}
	
	public float getArea() {
		float result = height*width;
		return result;
	}
}
