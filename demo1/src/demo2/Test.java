package demo2;

import java.util.Scanner;

public class Test {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x, y;
         int sum=0;
         input = new Scanner(System.in);
         y = (int) ((Math.random()*100)+1);
         System.out.println("��ʼ�����ֵ���Ϸ��\n����������:\n");
         while(true) {
        	 x = input.nextInt();
        	 Check tr = new Check();
        	 if(x > 100 || x < 0)try {
        		 tr.check(x);
        	 }catch(newexception e) {
        		 e.printStackTrace();
        	 }else if(x > y) { 
        		 sum++;
        		 System.out.println("�´��ˣ������ԣ�");
        	 }else if(x < y) {
        		 sum++;
        		 System.out.println("��С�ˣ�������");
        	 }else { 
        		 sum = sum+1;
                 System.out.println("��ϲ�㣬�¶��ˣ�һ������"+sum+"��");
                 break;
        	 }
         }
         
	}

}
