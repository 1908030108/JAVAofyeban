package 类的继承;

	class ClassA{
		int add(int a, int b) {
			return a+b;
		}
	}
	class ClassB extends ClassA{ 
/*ClassB继承了ClassA的方法即可调用本身的方法，也可调用ClassB的方法*/
		/*A为父类， B为子类*/
		 int mul(int a, int b) {
			 return a*b;	
	 }
	}
	public class Text{
	public static void main(String[] args) {
		 ClassA opearate1 = new ClassA();
		 System.out.println("两数相加"+opearate1.add(3,5));
		 ClassB opearate2 = new ClassB();
		 System.out.println("两数相加"+opearate2.add(5, 10));
		 System.out.println("两数相乘"+opearate2.mul(2, 4));
	}

}

