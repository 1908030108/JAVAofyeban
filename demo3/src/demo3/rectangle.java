package demo3;
//矩形的面积与周长
public class rectangle implements shape {
    int x, y;
    rectangle(int a,int b){
    	x = a;
    	y = b;
    }
	@Override
	public void  getround() {
		// TODO Auto-generated method stub
		if(x == y) {
			System.out.println("正方形的周长为："+4*x);
			}else
            System.out.println("矩形的周长为："+2*(x+y));
	}

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		if(x == y) {
			System.out.println("正方形的面积为："+x*x);
		}else
            System.out.println("矩形的面积为："+x*y);
	}

}
