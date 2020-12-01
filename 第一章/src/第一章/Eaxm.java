package 第一章;

import java.util.Scanner;

public class Eaxm {

	public static void main(String[] args) {
		long id;
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的学号");
		id = input.nextLong();
		System.out.println("请输入你的姓名：");
		name = input.next();
		System.out.println("你的学号是："+id);
		System.out.println("你的姓名是："+name);

	}

}
