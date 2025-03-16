package interfaceConcept;

public interface Sample 
{
	public void squre();
	
	
	static void circle() {
		System.out.println("from circle method");
	}
	
	default void area()
	{
		System.out.println("from area method");
	}
	
}
