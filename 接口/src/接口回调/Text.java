package �ӿڻص�;

/*����һ���ӿڲ��ڽӿ���������һ�����󷽷�*/
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
		
		Shape shape; //�ӿڱ���
		
		shape = new Circle(6);//new �ؼ���Ϊ�ӿڱ���shape������һ��Circle�Ŀռ�
	    System.out.println(shape.area());
	    shape = new Rectagle(3,4);
	    System.out.println(shape.area());
	}

	
    
	
}