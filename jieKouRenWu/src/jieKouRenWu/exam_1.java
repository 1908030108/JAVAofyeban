package jieKouRenWu;

interface Shape{
     public long fact(int m);
     public long intPower(int m, int n);
     public boolean findFactor(int m, int n);
}

class A implements Shape{

	//求阶乘
	public long fact(int m) {
		long sum = 1;
		for(int i = 1; i <= m; i++)
				sum *= i;
		return sum;
	}
   
	//求m的n次幂
	public long intPower(int m, int n) {
		long s = 1;
		for(int i = 1; i <= n; i++)
			s = s * m;
        return s;
	}

	//判断m和n的和是否大于100
	public boolean findFactor(int m, int n) {
		if(m + n > 100) return true;
		else return false;
	}
	
}
public class exam_1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.fact(5));
		System.out.println(a.findFactor(40,50));
		System.out.println(a.intPower(2, 3));

	}

}
