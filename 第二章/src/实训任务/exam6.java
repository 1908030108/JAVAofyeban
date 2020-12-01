package 实训任务;

public class exam6 {

	public static void main(String[] args) {
		int a[][] = {{12,  34, 56}, {56, 78, 65}, {66, 76, 44},{12, 34,63}};
        int b[][] = {{52, 78, 56 },{56, 728, 65},{66, 746, 44},{12,54, 53}};
        int  c[][], i, j;
        c = new int[4][3];
        for(i = 0; i < 4; i++) {
        	for(j = 0; j < 3; j++)
        		c[i][j] = a[i][j] +b[i][j];
        }
        System.out.println("a数组：");
        for(i = 0; i < 4; i++) {
        	for(j = 0; j < 3; j++)
        		System.out.print(" "+a[i][j]);
        	System.out.println();
        }
        System.out.println("b数组：");
        for(i = 0; i < 4; i++) {
        	for(j = 0; j < 3; j++)
        		System.out.print(" "+b[i][j]);
        	System.out.println();
        }
        System.out.println("c数组：");
        for(i = 0; i < 4; i++) {
        	for(j = 0; j < 3; j++)
        		System.out.print(" "+c[i][j]);
        	System.out.println();
        }
       
	}

}
