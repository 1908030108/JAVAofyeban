package 实训任务;
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
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+sex);
		System.out.println("家庭住址："+address);
		System.out.println("学历："+education);
	}
}

public class exam3 {

	public static void main(String[] args) {
		person t = new person();
		
		t.setName("汤顺志");
        t.setAge(19);
        t.setSex('男');
        t.setAddress("湖南省岳阳市");
        t.setEducation("大学本科");
        
        t.toPrint();
	}

}
