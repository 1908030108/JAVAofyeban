package 异常类;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam {
       public static void main(String args[]) {
    	   Scanner sc = new Scanner(System.in);
    	   int n = 0, m = 0, t = 1111;
    	   //若try能够正常运行，则catch不运行
    	   try {
    		   m = sc.nextInt();
    		   n = Integer.parseInt("1234"); //parse是将后面的字符串转化为整形
    		   t = 9999;
    	   }catch(NumberFormatException e) { //Format是指装换的格式发生了异常
    		   System.out.println("发生异常1："+e.getMessage());
    		   //getMessage 是指用该方法来获取异常信息
    		   e.printStackTrace();
    	   }catch(InputMismatchException e) { //键盘输入的格式信息发生异常
    		   System.out.println("发生异常2："+e.getMessage());
    		   e.printStackTrace();
    	   }finally {
    		   System.out.println("n="+n+",m="+m+",t="+t);
    	   }
       }
}
