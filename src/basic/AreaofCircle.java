package basic;

import java.util.Scanner;

public class AreaofCircle 
{	
	public static void main(String[] args) 
	{
		final double pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r=sc.nextInt();
		double output=(pi*r*r);
		System.out.println(output);
	}
}
