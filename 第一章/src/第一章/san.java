package ��һ��;

import java.util.Scanner;

public class san {

	public static void main(String[] args) {
		double a, b, c, p, area;
	    Scanner input = new Scanner(System.in);
	    System.out.println("�����������ε�����");
	     a = input.nextDouble();
	     b = input.nextDouble();
	     c = input.nextDouble();
	     if(a > 0 && b > 0 && c > 0 &&a+b>c && b+c > a && a+c>b) {
	    	 p = (a+b+c)/2;
	     area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	     System.out.println("area="+area);
	     }else {
	    	 System.out.println("���ܹ��������Σ�");
	     }
	}

}
