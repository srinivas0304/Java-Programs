package arrays;

import java.util.Scanner;

public class StringArrayDishes 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		String dishes[] = new String[size];
		String dishes2[] = new String[size];
		System.out.println("Enter names of dishes ");
		for(int i=0;i<size;i++) {
			dishes[i]=scanner.next();
		}
		
		for(int i=0;i<size-1;i++) {
			dishes2[i]=dishes[i];
		}
		for(String dishes21:dishes) {
			System.out.println(dishes21);
		}
	}
}
