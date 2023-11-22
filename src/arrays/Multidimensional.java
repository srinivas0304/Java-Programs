package arrays;

import java.util.Arrays;

public class Multidimensional 
{
	public static void main(String[] args) 
	{
//		int a[][] = new int[2][3];
//		a[0][0]=2;
//		a[0][1]=1;
//		a[0][2]=6;
//		a[1][0]=3;
//		a[1][1]=4;
//		a[1][2]=5;
		
		//System.out.println(a[0][2]);
		int b[][] = {{2,1,3},{5,6,8}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<=b.length;j++) {
				System.out.print(b[i][j]+" ");
			}
		}
		//System.out.println(Arrays.deepToString(b));
	}
}
