package testAutomationUniversity;

import java.util.Scanner;

public class GrossPay 
{
	public static void main(String[] args) 
	{
		//1. get hours worked
		System.out.println("Enter number of hours worked");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		//2. pay rate
		System.out.println("Enter the Employee's pay rate");
		double payRate = scanner.nextDouble();
		
		//3. multiple hours and pay rate
		double grossPay = hours*payRate;
		System.out.println("The Gross Pay of an Employee is $"+grossPay);
		
	}
}
