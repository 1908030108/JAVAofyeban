package 实训任务;

import java.util.Scanner;

public class exam5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, t;
		System.out.println("请输入三个整数");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a>b)
		{t = a; a = b; b = t;}
        if(a>c)
        {t = a; a = c; c = t;}
        if(b>c)
        {t = b; b = c; c = t;}
       
        System.out.println("a="+a+",b="+b+",c="+c);
	}
}
