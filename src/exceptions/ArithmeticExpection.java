package exceptions;

public class ArithmeticExpection 
{
	public static void main(String[] args)
	{
		//toAvoidException();
		//exceptioCaught();
	}
	
	public static void exceptioCaught()
	{
		int num=5;
		if(num/0==0)
		{
			System.out.println("Yes");
		}
	}
	
	public static void toAvoidException()
	{
		int num1=5,num2=0;
		
		try
		{
			int res=num1/num2;
			System.out.println("Result: "+res);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception Caught: "+a.getMessage());
		}
	}
}
