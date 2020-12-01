package demo3;
//圆的面积与周长
final public class circle implements shape {
    double r;
    circle(double a){
    	r = a;
    }
	@Override
	public void getround() {
		// TODO Auto-generated method stub
      System.out.println("圆的周长为："+3.14*r*r);
	}

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		System.out.println("圆的面积为："+3.14*2*r);
	}

}
