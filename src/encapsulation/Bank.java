package encapsulation;


class Account
{
	public String name;
	protected String email;
	private String password;
	
	public String getPassword()
	{
		//String randomPass = Random;
		//setPassword(randomPass);
		return this.password;
	}
	public void setPassword(String pass)
	{
		this.password=pass;
	}
}

public class Bank 
{
	public static void main(String[] args) 
	{
		Account axis=new Account();
		axis.name="A Srinivas";
		axis.email="srinivas@gmail.com";
		System.out.println(axis.getPassword());
	}
}
