package loops;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		//Take the input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int r,sum=0;
		int temp = num;
		while(num>0)
		{
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if(temp==num)
		{
			System.out.println("The entered number "+temp+" is Palindrome");
		}
		else
		{
			System.out.println("The entered number "+temp+" is not Palindrome");
		}
	}
}
