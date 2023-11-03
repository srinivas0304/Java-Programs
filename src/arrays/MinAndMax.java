package arrays;

public class MinAndMax 
{
	public static void findMinMax(int[] arr)
	{
		int max = arr[0];
		int min = arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Maximum element: "+max);
		System.out.println("Minimum element: "+min);
	}
	public static void main(String[] args) 
	{
		int[] arr = {-9,-2,65,2,4,85};
		findMinMax(arr);
		
	}
	
}
