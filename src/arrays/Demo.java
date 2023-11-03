package arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args)
	{
		int arr[] = {10,20,25,30};
		String strArray = Arrays.toString(arr);
		System.out.println(strArray);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
