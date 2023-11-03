package accessModifiers;

public class PublicAccess 
{
	public static void main(String[] args) 
	{
		
		PublicAccess.demo();
		ProtectedAccess.demo1();
	}
	
	public static void demo()
	{
		int i =25;
		System.out.println(i);
	}
}
