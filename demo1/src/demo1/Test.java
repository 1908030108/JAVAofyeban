package demo1;

import java.util.Scanner;

// ��ȭ��Ϸ
public class Test {
	private static Scanner input;

	public static void main(String[] args) {
	    int x, y;  
	    input = new Scanner(System.in);
	    x = input.nextInt();
	    y = (int) (Math.random()*3+1);
//	    1 ��������� 2 ����ʯͷ 3 ����
	    if(x == 1 && y == 2 || x == 2 && y == 3 || x == 3 && y==1) {
	    	System.out.println("������");
	    }else if(x == y) {
	    	System.out.println("ƽ��");
	    }else
	    	System.out.println("��Ӯ��");
	}

}
