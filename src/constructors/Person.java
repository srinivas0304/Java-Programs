package constructors;

public class Person 
{
	private String name;
	private int age;
	
	//Default constructor
	public Person()
	{
		name = " ";
		age = 0;
	}
	
	//Constructor takes name parameter
	public Person(String name)
	{
		this.name = name;
	}
	
	//Constructor takes name, age parameters
	public Person(String name, int age)
	{
		this.name = name;
		this.age  = age;
	}
	
	public String toString()
	{
		return name+" "+age;
	}
}
	class PrepBytes
	{
		public static void main(String[] args)
		{
			Person p1 = new Person();
			System.out.println(p1.toString());
			
			Person p2 = new Person("PrepBuddy", 25);
			System.out.println(p2.toString());
		}
	}

