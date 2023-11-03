package singletonclass;

public class Singleton 
{
	private static Singleton single_instance = null;
	
	public String s;
	
	//private constructor
	private Singleton()
	{
		s = "inside constructor";
	}
	
	public static synchronized Singleton getInstance()
	{
		if(single_instance == null)
		single_instance = new Singleton();
		
		return single_instance;
	}
}
