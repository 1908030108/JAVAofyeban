package ��ļ̳�;

class A {
    int x = 10, y = 20;
    void f() {
    	System.out.println("A��ķ���");
        System.out.println("x="+x+", y=" + y);
    }
    public void g() {
    	
    }
}

class B extends A{
	/*��������������ͬʱ,�Ὣ����A��x����*/
	int x = 100;
	void f() {
		System.out.println("B��ķ���");
	    System.out.println("x="+x+",y="+y);
	}
	/*void g() {
  //����ķ�����public ������  ��д���෽����ʱ�򣬲��ܽ��͸���ķ���Ȩ��
   * ����Ȩ���ɸߵ��ͣ�
   *       public������˵������
   *       protected ����������˵������
   *       private(˽�з���˵����)
   *       friend(ȱʡ����˵����)
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