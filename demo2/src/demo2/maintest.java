package demo2;

import java.util.Scanner;

public class maintest {

	public static void  main(String[] args) {
		int x, y;
		int sum = 0;
		y = (int)(Math.random()*100+1);
		System.out.println("ϵͳ��������������뿪ʼ�°ɣ�");
		Scanner input = new Scanner(System.in);
		while(true) {
			x = input.nextInt();
			if(x > y) {
				sum++;
				System.out.println("�µ�̫���ˣ������");
				
			}else if(x < y) {
				sum++;
				System.out.println("�µ�̫С�ˣ������");
			}else  break;
		}
		sum= sum+1;
	   System.out.println("��ϲ�㣬�¶��ˣ���һ������"+sum+"��");
	}

}
