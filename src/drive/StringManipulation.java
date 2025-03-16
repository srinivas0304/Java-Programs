package drive;

import java.util.Arrays;

public class StringManipulation 
{
	public static void reverseString()
	{
		String str="hyderabad";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static boolean palindromeCheck()
	{
		String str="radar";
		int start=0;
		int end=str.length()-1;
		while(start<end)
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
	
	public static void anagramCheck()
	{
		String str1="race";
		String str2="sami";
		if(str1.length()!=str2.length())
		{
			System.out.println("Not a Anagram");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("Given Strings are Anagram");
			}
			else
			{
				System.out.println("Not a Anagram");
			}
		}
	}
	
	public static void characterCount()
	{
		String str="india";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='i')
			{
				count++;
			}
		}
		System.out.println("The Character Count: "+str+"--> "+count);
	}
	
	public static void main(String[] args)
	{
		//System.out.println(palindromeCheck());
		//reverseString();
		//anagramCheck();
		characterCount();
	}
}
