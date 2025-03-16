package hashmap;

import java.util.HashMap;

public class DuplicateNumbers 
{
	public static void main(String[] args) 
	{
		int arr[]= {8,9,2,7,2,8,6,7};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i:arr) 
		{
			if(map.containsKey(i)) 
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		//printing
		for(int s:map.keySet())
		{
			if(map.get(s)>1) 
			{
				System.out.print(s+" ");
			}
		}
	}
}
