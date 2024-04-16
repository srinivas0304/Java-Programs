package accessModifiers;

public class ProtectedAccess 
{
	public static void main(String[] args) 
	{
		protectedMethod();//we can access only within same package not in other packages.
		//PrivateAccess.privateMethod();// we cannot access private method because it is restricted to only in the same class.
		//Error message: he method privateMethod() from the type PrivateAccess is not visible
		PublicAccess.publicMethod();
		
		PrivateAccess ps=new PrivateAccess();
		ps.setNum(29);
		System.out.println(ps.getNum());
	}
	
	protected static void protectedMethod()
	{
		int age = 20;
		System.out.println(age);
	}
}
