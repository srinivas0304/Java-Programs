package linkedin;

import java.util.Arrays;

public class ModifyArray 
{
	public static void main(String[] args)
	{
		int [] array= {1,2,3,4,5};
		modifyArray(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void modifyArray(int[] arr)
	{
		arr[0]=10;
		arr[1]=20;
	}
}
