package linkedin;

import java.util.Arrays;

public class ArraysConcept 
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				arr[i]=arr[i]/2;
				
			}
			else
			{
				arr[i]=arr[i]*2;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
}
