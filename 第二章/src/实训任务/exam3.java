package ʵѵ����;
class person{
	String name;
	char sex;
	int age;
	String address;
	String education;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	
	void toPrint() {
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("�Ա�"+sex);
		System.out.println("��ͥסַ��"+address);
		System.out.println("ѧ����"+education);
	}
}

public class exam3 {

	public static void main(String[] args) {
		person t = new person();
		
		t.setName("��˳־");
        t.setAge(19);
        t.setSex('��');
        t.setAddress("����ʡ������");
        t.setEducation("��ѧ����");
        
        t.toPrint();
	}

}
