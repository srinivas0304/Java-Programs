package accessModifiers;

public class ProtectedAccess 
{
	public static void main(String[] args) 
	{
		ProtectedAccess.demo1();//we can access only within same package not in other packages.
	}
	
	protected static void demo1()
	{
		int age = 20;
		System.out.println(age);
	}
}
