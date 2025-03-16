package hashmap;

public class DuplicateNumbersUsingForLoop 
{
	public static void main(String[] args) 
	{
		int[] arr= {7,8,2,1,3,5,2,3,7};
		System.out.println("Duplicate Numbers in given array: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}
