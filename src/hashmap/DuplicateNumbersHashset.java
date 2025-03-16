package hashmap;

import java.util.HashSet;

public class DuplicateNumbersHashset
{
	public static void main(String[] args)
	{
		int arr[]= {7,8,2,1,1,3,1,5,4,5};
		HashSet<Integer> myset=new HashSet<>();
		for(Integer num:arr)
		{
			if(!myset.contains(num))
			{
				myset.add(num);
			}
		}
		//print the duplicate numbers
		for(Integer num:arr) 
		{
			if(!myset.contains(num))
			{
				System.out.println(num);
			}
		}
	}
}
