package demo1;

import java.util.Scanner;

// 猜拳游戏
public class Test {
	private static Scanner input;

	public static void main(String[] args) {
	    int x, y;  
	    input = new Scanner(System.in);
	    x = input.nextInt();
	    y = (int) (Math.random()*3+1);
//	    1 代表剪刀， 2 代表石头 3 代表布
	    if(x == 1 && y == 2 || x == 2 && y == 3 || x == 3 && y==1) {
	    	System.out.println("你输了");
	    }else if(x == y) {
	    	System.out.println("平局");
	    }else
	    	System.out.println("你赢了");
	}

}
