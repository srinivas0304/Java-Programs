package inheritanceConcept;

public class Admin extends Developer
{
	public void manage() {
		read();//before creating read method inside the same class, it will redirect to Guest class where read() is exists.
		//but after creating a read() within a class it will check whether the method exists within a class.
		//locally it will verify
		//so if we use super keyword then it will trigger to the parent class method
		super.read();//Guest class read()
		write();
		System.out.println("add or delete code");
	}
	
	public void read() {
		System.out.println("Admin read code");
	}
	
}
