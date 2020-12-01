package jieKouRenWu;

interface IShape{
	public abstract double area();
}
class Square implements IShape{
    double a;
    public Square() {
    	a = 0;
    }
    public Square(double a){
    	this.a = a;
    }
   //求正方形面积
	public double area() {
		return a * a;
	}
	
}
public class exam_2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 Square s1;
    	 s1 = new Square(5);
    	 System.out.println(s1.area());
    	 
	}

}
