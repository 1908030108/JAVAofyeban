package �쳣��;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam {
       public static void main(String args[]) {
    	   Scanner sc = new Scanner(System.in);
    	   int n = 0, m = 0, t = 1111;
    	   //��try�ܹ��������У���catch������
    	   try {
    		   m = sc.nextInt();
    		   n = Integer.parseInt("1234"); //parse�ǽ�������ַ���ת��Ϊ����
    		   t = 9999;
    	   }catch(NumberFormatException e) { //Format��ָװ���ĸ�ʽ�������쳣
    		   System.out.println("�����쳣1��"+e.getMessage());
    		   //getMessage ��ָ�ø÷�������ȡ�쳣��Ϣ
    		   e.printStackTrace();
    	   }catch(InputMismatchException e) { //��������ĸ�ʽ��Ϣ�����쳣
    		   System.out.println("�����쳣2��"+e.getMessage());
    		   e.printStackTrace();
    	   }finally {
    		   System.out.println("n="+n+",m="+m+",t="+t);
    	   }
       }
}
