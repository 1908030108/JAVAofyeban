package 第一章;

import java.util.Scanner;

public class def {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int a, b;
	    System.out.println("请输入两个整数");
	    a = input.nextInt();
	    b = input.nextInt();
	    if(a > b) {
	    	System.out.println(a+","+b);
	    }else {
	    	System.out.println(b+","+a);
	    }

	}

}
