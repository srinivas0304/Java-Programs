package allprograms;

public class PrimeNumber 
{
	public static boolean isPrime()
	{
		int num=11;
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isPrime());
	}
}
