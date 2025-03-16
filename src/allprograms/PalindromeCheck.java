package allprograms;

public class PalindromeCheck 
{
	public static boolean palindrome(String str)
	{
		int start=0;
		int end=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			
		if(str.charAt(start)!=str.charAt(end))
		{
			return false;
		}
		start++;
		end--;
	}
		return true;
	
	}
	public static void main(String[] args) 
	{
		
		System.out.println(palindrome("radar"));
	}
}
