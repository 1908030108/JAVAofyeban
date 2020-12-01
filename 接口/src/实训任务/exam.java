package 实训任务;

interface shape{
	public long fact(int m);
	public boolean findFacot(int m, int n);
    public long intPower(int m, int n);
}

class A implements shape{

	//实现m的阶乘
	public long fact(int m) {
		long sum; 
		sum = 1;
		for(int i = 1; i <= m; i++)
			sum = sum * i;
		return sum;
	}

	//判断m和n的和是否大于100
	public boolean findFacot(int m, int n) {
		if(m + n > 100)
			return true;
		else
		    return false;
	}

	//求m的n次幂
	public long intPower(int m, int n) {
		long v; 
		v = 1;
		for(int i = 1; i <= n; i++)
			v = v * m;
		return v;
	}
	
}
class text {
     public static void main(String[] args) {
    	 A a = new A();
    	 System.out.println(a.fact(5));
    	 System.out.println(a.findFacot(50, 50));
    	 System.out.println(a.intPower(2 , 3));
     }
}
