package accessModifiers;

public class PrivateAccess 
{
	public static void main(String[] args)
	{
		PrivateAccess.demo2();
	}
	
	private static void demo2()
	{
		int j=23;
		System.out.println(j);
	}
}
