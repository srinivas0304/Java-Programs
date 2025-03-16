package interfaceConcept;

public interface Demo {
	void demo1();
	
	default void demo2() {
		System.out.println("from demo()2 method");
	}
	
	static void demo3()
	{
		System.out.println("from demo()3 method");
	}

}
