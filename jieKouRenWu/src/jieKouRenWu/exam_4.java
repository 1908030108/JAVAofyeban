package jieKouRenWu;

interface ��������Ϣ�ϱ�{
	String message = "��ʵ�ϱ�";
	String ��Ⱦ����(String shengFen, int num);
	String ��������(String shengFen, int num);
	String ���нӴ�������(String shengFen, int num);
}

class jilin implements ��������Ϣ�ϱ�{

	public char[] ��Ⱦ����;
	public char[] ��������;
	public char[] ���нӴ�������;

	public String ��Ⱦ����(String shengFen,int num) {
	
		return shengFen+num;
	}

	public String ��������(String shengFen,int num) {
		return shengFen+ num;
	}

	public String ���нӴ�������(String shengFen, int num) {
		return shengFen+num;
	}
	
}
public class exam_4 {

	public static void main(String[] args) {
          jilin person = new jilin();
          System.out.println(��������Ϣ�ϱ�.message);
          System.out.println("��Ⱦ������");
          System.out.println(person.��Ⱦ����("����ʡ",20));
          System.out.println(person.��Ⱦ����("����ʡ",20));
          System.out.println(person.��Ⱦ����("�Ϻ�ʡ",20));
          System.out.println("����������");
          System.out.println(person.��������("����ʡ",20));
          System.out.println(person.��������("����ʡ",20));
          System.out.println(person.��������("�Ϻ�ʡ",20));
          System.out.println("���нӴ���������");
          System.out.println(person.���нӴ�������("����ʡ",20));
          System.out.println(person.���нӴ�������("����ʡ",20));
          System.out.println(person.���нӴ�������("�Ϻ�ʡ",20));

	}

}
