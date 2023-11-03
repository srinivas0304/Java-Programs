package arrays;

import java.util.Scanner;

public class DuplicateElement 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements you want to store");
		int ele = sc.nextInt();
		int[] arr = new int[5];
		System.out.println("Enter Elements of the array: ");
		for(int i=0;i<ele;i++) {
			arr[i]=sc.nextInt();
		}
				for(int j=0;j<arr.length;j++)
				{
					for(int k=j+1;k<arr.length;k++) {
						if((arr[j]==arr[k]) && (j!=k))
						{
							System.out.println("Duplicate element: "+arr[k]);
						}
					}
				}
	}
}
