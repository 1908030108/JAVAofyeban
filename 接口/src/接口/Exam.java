package �ӿ�;

/*��interface�ؼ��ִ���һ���ӿ�*/
interface TextI{  
	/*public static final */ int max = 100;//�ೣ���Ķ���
	float f(float x, float y);//���󷽷��Ķ���
	
}

/*����AA��ʵ�֣�implements���ӿ�*/
//��ζ��AA����ʵ�ֽӿ�TextI����ĳ��󷽷�(���еĳ��󷽷�)
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
		
		System.out.println(TextI.max);  //maxΪ�ೣ��������ͨ���ӿ�����ֱ�ӷ���
	}
}