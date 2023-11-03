package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRev
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		//ArraysList<int> inst = new ArrayList<int>();//Syntax error, insert "Dimensions" to complete ReferenceType
		list.add("QA");
		list.add("SQL");
		list.add("Java");
		list.add("Python");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.contains("Python"))
			{
				list.remove(3);
				
			}
			System.out.println(itr.next());		
			
		}
	}
}
