package 异常类;

import java.util.InputMismatchException;
import java.util.Scanner;
//将出现的异常调用他的上一层方法抛出
//格式  [修饰符] 返回类型 方法名(<参数表>) throw 异常类表
public class 抛出异常 {
	static StudentInfo inputStudentInfo() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		int number;
		String name;
		float score;
		number = sc.nextInt();
		name = sc.next();
		score = sc.nextFloat();
		return new StudentInfo(number,name,score);
	}

	public static void main(String[] args) {
         StudentInfo stu;
         try {
        	 stu = inputStudentInfo();
        	 System.out.println(stu.number+" "+ stu.name+" "+stu.score);
         }catch(InputMismatchException e){
        	 e.printStackTrace();
        	 System.out.println("键盘输入类型异常");
         }
	}

}
