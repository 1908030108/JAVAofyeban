package demo2;

import java.util.Scanner;

public class maintest {

	public static void  main(String[] args) {
		int x, y;
		int sum = 0;
		y = (int)(Math.random()*100+1);
		System.out.println("系统生成了随机数，请开始猜吧：");
		Scanner input = new Scanner(System.in);
		while(true) {
			x = input.nextInt();
			if(x > y) {
				sum++;
				System.out.println("猜的太大了，请继续");
				
			}else if(x < y) {
				sum++;
				System.out.println("猜的太小了，请继续");
			}else  break;
		}
		sum= sum+1;
	   System.out.println("恭喜你，猜对了，你一共猜了"+sum+"次");
	}

}
