package ʵѵ����;

class Student{
	String name;
	int age;
    char sex;
    
    void print() {
    	System.out.println("������"+name);
    	System.out.println("����:"+age);
    	System.out.println("�Ա�"+sex);
    }
}

public class eaxm8 {

	public static void main(String[] args) {
		Student std1 = new Student();
		
		std1.name = "��˳־";
		std1.age = 19;
		std1.sex = '��';
        
		std1.print();
	}

}
