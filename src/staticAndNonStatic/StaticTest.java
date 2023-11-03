package staticAndNonStatic;

public class StaticTest
{
	static int num = 20;
	
	int num2 = 30;
	StaticTest staticTest = new StaticTest();
	public static void main(String[] args)
	{
		//System.out.println(StaticTest.num);
	//StaticTest.test();
		
		//staticTest.nonStatic();
		
		
	}
	
	public static void test()
	{
		System.out.println("From test method");
	}
	
	public void nonStatic()
	{
	System.out.println(num2);
	
	}
}
