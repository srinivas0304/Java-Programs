package inheritanceConcept;

public class User implements IAdmin
{
	public static void main(String[] args) 
	{
		User u=new User();
		u.read();
	}
	@Override
	public void read() {
		System.out.println("read code -- interface");
	}
	@Override
	public void write() {
		System.out.println("write code -- interface");
	}
	@Override
	public void manage() {
		System.out.println("add or delete code -- interface");
	}
}
