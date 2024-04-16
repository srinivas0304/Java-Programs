package accessModifiers;

public class PublicAccess 
{
	public static void main(String[] args) 
	{
		
		PublicAccess.publicMethod();
		ProtectedAccess.protectedMethod();
		//PrivateAccess.privateMethod();//we cannot access private method because it is restricted to only in the same class.
		//Error message: he method privateMethod() from the type PrivateAccess is not visible.
		
		
		PrivateAccess psa=new PrivateAccess();
		psa.setNum(35);
		System.out.println(psa.getNum());
	}
	
	public static void publicMethod()
	{
		int i =25;
		System.out.println(i);
	}
}
