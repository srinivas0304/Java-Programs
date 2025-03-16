package basic;

import java.util.Scanner;

public class NameReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		String [] rev=str.split(" ");
		for(int i=rev.length-1;i>=0;i--)
		{
			System.out.print(rev[i]+" ");
		}
	}
}
