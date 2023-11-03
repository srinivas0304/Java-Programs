package objectclass;

public class ObjectClass 
{
	int n1;
	int n2;
	int n3;
	static int result;
	
	public static void main(String[] args) 
	{
		ObjectClass obj = new ObjectClass();
		obj.n1 = 10;
		obj.n2 = 20;
		obj.n3 = 15;
		
		obj.additionTwo();
		obj.additionThree();
	}
	
	void additionTwo()
	{
		result = n1+n2;
		System.out.println("Addition of two numbers: "+result);
	}
	
	void additionThree()
	{
		result = n1+n2+n3;
		System.out.println("Addition of three numbers: "+result);
	}
	
}
