package testAutomationUniversity;

import java.util.Scanner;

public class Season 
{
	public static void main(String[] args) 
	{
		//1. season year
		System.out.println("Enter season of the year");
		Scanner scanner = new Scanner(System.in);
		int seasonYear = scanner.nextInt();
		
		//2. whole number
		System.out.println("Enter number of times you drink coffee");
		int num = scanner.nextInt();
		
		//3. adjective
		System.out.println("Enter the adjective");
		String adjective = scanner.next();
		
		System.out.println("On a "+adjective+" "+seasonYear+" day,"+"I drink a minimum of "+num+" cups of coffee");
		
	}
}
