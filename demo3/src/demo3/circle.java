package demo3;
//Բ��������ܳ�
final public class circle implements shape {
    double r;
    circle(double a){
    	r = a;
    }
	@Override
	public void getround() {
		// TODO Auto-generated method stub
      System.out.println("Բ���ܳ�Ϊ��"+3.14*r*r);
	}

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		System.out.println("Բ�����Ϊ��"+3.14*2*r);
	}

}
