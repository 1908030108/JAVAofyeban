package �쳣��;

import java.util.InputMismatchException;
import java.util.Scanner;
//�����ֵ��쳣����������һ�㷽���׳�
//��ʽ  [���η�] �������� ������(<������>) throw �쳣���
public class �׳��쳣 {
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
        	 System.out.println("�������������쳣");
         }
	}

}
