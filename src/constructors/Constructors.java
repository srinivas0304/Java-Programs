package constructors;

public class Constructors 
{
	int age;
	String name;
	
	public Constructors(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(age+" "+name);
	}
			
	
	public static void main(String[] args) 
	{
		Constructors ct = new Constructors(121,"Deva");
		ct.display();
	}
}
