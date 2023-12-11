package patterns;

import java.util.Scanner;

public class Triangular 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int r = scanner.nextInt();
		System.out.println();
		for(int i=0;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
