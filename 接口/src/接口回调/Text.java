package 接口回调;

/*创建一个接口并在接口里面设置一个抽象方法*/
interface Shape{
	abstract double area();
}

class Circle implements Shape{
     double r;
    
     Circle(double r){
    	 this.r = r;
     }
     
     public double area() {
    	 return 3.14*r*r;
     }
}

class Rectagle implements Shape{
	double a, b;

	Rectagle(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double area() {
		return a*b;
	}

}

class Text{
	public static void main(String[] args) {
		
		Shape shape; //接口变量
		
		shape = new Circle(6);//new 关键字为接口变量shape开辟了一个Circle的空间
	    System.out.println(shape.area());
	    shape = new Rectagle(3,4);
	    System.out.println(shape.area());
	}

	
    
	
}