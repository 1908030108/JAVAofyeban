package ��ļ̳�;

	class ClassA{
		int add(int a, int b) {
			return a+b;
		}
	}
	class ClassB extends ClassA{ 
/*ClassB�̳���ClassA�ķ������ɵ��ñ���ķ�����Ҳ�ɵ���ClassB�ķ���*/
		/*AΪ���࣬ BΪ����*/
		 int mul(int a, int b) {
			 return a*b;	
	 }
	}
	public class Text{
	public static void main(String[] args) {
		 ClassA opearate1 = new ClassA();
		 System.out.println("�������"+opearate1.add(3,5));
		 ClassB opearate2 = new ClassB();
		 System.out.println("�������"+opearate2.add(5, 10));
		 System.out.println("�������"+opearate2.mul(2, 4));
	}

}

