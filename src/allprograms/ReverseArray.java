package allprograms;

public class ReverseArray 
{
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array in Reverse Order: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
