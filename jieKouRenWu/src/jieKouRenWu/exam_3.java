package jieKouRenWu;

interface ���{
	String MESSAFE ="2020��5��1��ǰ��Ϣ��ʵ�ϱ�";
	public String �շ�(String name,double money);
}
class ������˾ implements ���{
      
	//������˾�����֣�����
	public String �շ�(String name, double money) {
		
		return (name +"�ķ�����" + money + "��");
	}

}
	

class ѧУ implements ���{
	public String �շ�(String name, double money) {
		 
		return (name + "�ķ�����" + money + "��");
	}
}
public class exam_3 {

	public static void main(String[] args) {
		System.out.println(���.MESSAFE);
		������˾ G = new ������˾();
	     ѧУ S = new ѧУ();
	     String baiYangTian = "baiYangTian";
		   System.out.println(G.�շ�(baiYangTian,20));
		 String taoLin = "toaLin";
		   System.out.println(S.�շ�(taoLin,2000));
	}

}
