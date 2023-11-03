package strings;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String actual = "dev";
		String rev = "";
		
		for(int i=0;i<actual.length();i++)
		{
			char ch= actual.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);
	}
}
