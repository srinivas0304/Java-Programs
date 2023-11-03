package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		ArrayList<String > list = new ArrayList<String>();
		list.add("Dev");
		list.add("Test");
		list.add("TestDev");
		list.add("DevTest");
		
		//get the iterator
		Iterator<String> itr =list.iterator();
		//System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
