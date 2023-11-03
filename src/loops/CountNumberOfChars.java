package loops;

public class CountNumberOfChars 
{
	public static void main(String[] args) 
	{
		String str = "3-4-349/351, Opposite to RBVRR Pharmacy College, Barkatpura, Hyderabad - 500027";
		int count =0;
		
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i) !=' ');
			count++;
		}
		System.out.println(count);
	}
}
