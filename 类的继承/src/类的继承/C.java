package 类的继承;

class A {
    int x = 10, y = 20;
    void f() {
    	System.out.println("A类的方法");
        System.out.println("x="+x+", y=" + y);
    }
    public void g() {
    	
    }
}

class B extends A{
	/*当父类与子类相同时,会将父类A的x隐藏*/
	int x = 100;
	void f() {
		System.out.println("B类的方法");
	    System.out.println("x="+x+",y="+y);
	}
	/*void g() {
  //父类的方法是public 而子类  重写父类方法的时候，不能降低父类的访问权限
   * 访问权限由高到低：
   *       public（访问说明符）
   *       protected （保护访问说明符）
   *       private(私有访问说明符)
   *       friend(缺省访问说明符)
	}
	*/
	public void g() {
		
	}
}

public class C{
	public static void main(String[] args) {
	    A a = new A();
	   a.f();
	   a.g();
	    B b = new B();
	    b.f();
	    b.g();
	   System.out.println(a.x);
	   System.out.println(a.y);
	   System.out.println(b.x);
	   System.out.println(b.y);
	}
}