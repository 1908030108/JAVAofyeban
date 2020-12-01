package 接口;

/*用interface关键字创建一个接口*/
interface TextI{  
	/*public static final */ int max = 100;//类常量的定义
	float f(float x, float y);//抽象方法的定义
	
}

/*用类AA来实现（implements）接口*/
//意味着AA必须实现接口TextI里面的抽象方法(所有的抽象方法)
class AA implements TextI{
	public float f(float x, float y) {
		return x+y;
	}
}

class BB implements TextI{
	public float f(float x, float y) {
		return x*y;
	}
}




public class Exam{
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		System.out.println(a.f(10, 20));
		System.out.println(b.f(2, 3));
		
		System.out.println(TextI.max);  //max为类常量，可以通过接口名来直接访问
	}
}