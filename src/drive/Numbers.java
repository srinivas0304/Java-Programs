package drive;

public class Numbers 
{
	public static void fibonacci()
	{
		int num=5,a=0,b=0,c=1;
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		fibonacci();
	}
}
