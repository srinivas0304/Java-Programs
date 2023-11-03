package basic;

import java.util.Scanner;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int courses;
		System.out.println("Number Of Courses Offered by Q-Spiders");
		courses = input.nextInt();
		input.skip(System.lineSeparator());//it will separates the input
		String[] courseList = new String[courses];
		
		for(int counter=0;counter<courses;counter++)
		{
			System.out.println("Enter the name of the course: "+(counter+1));
			courseList[counter] = input.nextLine();
		}
		input.close();
		System.out.println("The list of courses");
		for(int counter = 0; counter<courses;counter++)
		{
			System.out.println(courseList[counter]);
		}
	}
}
