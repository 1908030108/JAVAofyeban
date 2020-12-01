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
         System.out.println("开始猜数字的游戏：\n请输入数字:\n");
         while(true) {
        	 x = input.nextInt();
        	 Check tr = new Check();
        	 if(x > 100 || x < 0)try {
        		 tr.check(x);
        	 }catch(newexception e) {
        		 e.printStackTrace();
        	 }else if(x > y) { 
        		 sum++;
        		 System.out.println("猜大了，请重试：");
        	 }else if(x < y) {
        		 sum++;
        		 System.out.println("猜小了，请重试");
        	 }else { 
        		 sum = sum+1;
                 System.out.println("恭喜你，猜对了，一共用了"+sum+"次");
                 break;
        	 }
         }
         
	}

}
