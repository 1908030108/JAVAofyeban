package 第一章;

import java.util.Scanner;

public class bai {

	public static void main(String[] args) {
		double score;
		char grade;
		System.out.println("请输入一个百分制的成绩：");
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		if(score < 0 || score > 100) {
			System.out.println("成绩不合法");
			System.exit(0);
		}
		int n = (int)(score/10);
		switch(n) {
		case 10:
		case 9: grade = '优'; break;
		case 8: grade = '良'; break;
		case 7: grade = '中'; break;
		case 6: grade = '及'; break;
		default: grade = '不';
		}
		System.out.println("百分制成绩："+score+"对应等级是："+grade);
	}

}
