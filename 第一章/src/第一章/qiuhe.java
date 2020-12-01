package ╣зр╩уб;

public class qiuhe {

	public static void main(String[] args) {
		int i , sum;
		sum = 0;
		for(i = 1; i <= 100; i++) {
			if(i% 3 == 0 && i % 7 != 0) {
				System.out.println(i+" ");
				sum = sum + i;
			}
		}
		System.out.print("sum = "+sum);
	}

}
