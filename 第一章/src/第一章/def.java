package ��һ��;

import java.util.Scanner;

public class def {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int a, b;
	    System.out.println("��������������");
	    a = input.nextInt();
	    b = input.nextInt();
	    if(a > b) {
	    	System.out.println(a+","+b);
	    }else {
	    	System.out.println(b+","+a);
	    }

	}

}
