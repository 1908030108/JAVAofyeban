package 实训任务;

class Student{
	String name;
	int age;
    char sex;
    
    void print() {
    	System.out.println("姓名："+name);
    	System.out.println("年龄:"+age);
    	System.out.println("性别："+sex);
    }
}

public class eaxm8 {

	public static void main(String[] args) {
		Student std1 = new Student();
		
		std1.name = "汤顺志";
		std1.age = 19;
		std1.sex = '男';
        
		std1.print();
	}

}
