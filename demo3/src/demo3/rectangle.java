package demo3;
//���ε�������ܳ�
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
			System.out.println("�����ε��ܳ�Ϊ��"+4*x);
			}else
            System.out.println("���ε��ܳ�Ϊ��"+2*(x+y));
	}

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		if(x == y) {
			System.out.println("�����ε����Ϊ��"+x*x);
		}else
            System.out.println("���ε����Ϊ��"+x*y);
	}

}
