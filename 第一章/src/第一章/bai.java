package ��һ��;

import java.util.Scanner;

public class bai {

	public static void main(String[] args) {
		double score;
		char grade;
		System.out.println("������һ���ٷ��Ƶĳɼ���");
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		if(score < 0 || score > 100) {
			System.out.println("�ɼ����Ϸ�");
			System.exit(0);
		}
		int n = (int)(score/10);
		switch(n) {
		case 10:
		case 9: grade = '��'; break;
		case 8: grade = '��'; break;
		case 7: grade = '��'; break;
		case 6: grade = '��'; break;
		default: grade = '��';
		}
		System.out.println("�ٷ��Ƴɼ���"+score+"��Ӧ�ȼ��ǣ�"+grade);
	}

}
