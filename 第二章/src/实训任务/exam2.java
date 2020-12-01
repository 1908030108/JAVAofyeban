package ÊµÑµÈÎÎñ;

class Circle{
	float r;
	
	float length() {
		return 2* 3.14f*r*r;
	}
	float area() {
		return 3.14f*r*r;
	}
}

public class exam2 {

	public static void main(String[] args) {
		Circle c1, c2;
		c1 = new Circle();
		c2 = new Circle();
		c1.r = 2.5f;
		c2.r = 3.5f;
		
		System.out.println(c1.length());
		System.out.println(c1.area());
		System.out.println(c1.length());
		System.out.println(c1.area());	

	}

}
