package 第一章;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入变量a的值");
		a=input.nextInt();
		System.out.println("请输入变量b的值");
		b = input.nextInt();
		System.out.println("a+b="+(a+b));
	}

}
