package arrays;

import java.util.Scanner;

public class EvenNumbersInArray
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of an array");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.print("Even numbers are in given array: ");
		for(int i=0;i<size;i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
		}
		}
	}
}
