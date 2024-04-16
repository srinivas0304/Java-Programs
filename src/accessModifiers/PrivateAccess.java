package accessModifiers;

public class PrivateAccess 
{
	public static void main(String[] args)
	{
		privateMethod();
		
		PrivateAccess pa=new PrivateAccess();
		pa.setNum(29);
		System.out.println(pa.getNum());
		
	}
	//we can access private variable in other packages and classes, we can make use of getter and setter concept
	private static void privateMethod()
	{
		int j=23;
		System.out.println(j);
	}
	private int j;
	public int getNum() {
		return j;
	}
	public void setNum(int num) {
		this.j=num;
	}
}
