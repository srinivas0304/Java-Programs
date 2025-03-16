package drive;

import java.util.Arrays;

public class Main 
{
	public static void reverseArray()
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of an Array: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void secondLargestNumber()
	{
		int[] arr=new int[] {2,5,98,74,100,45};
		int temp,num=6;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[num-2]);
	}
	
	public static void characterCount()
	{
		String str="testing";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='t')
			{
				count++;
			}
		}
		System.out.println("The character appears: "+count);
	}
	
	public static void anagramCheck()
	{
		String str1="race";
		String str2="care";
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
	
	public static boolean isPalindrome()
	{
		String str="radar";
		int start=0;
		int end=str.length()-1;
		while(start>end)
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
	
	public static void pyramidPattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void nameReverser()
	{
		String str="my name is srinivas";
		String[] rev=str.split(" ");
		for(int i=rev.length-1;i>=0;i--)
		{
			System.out.print(rev[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		//reverseArray();
		//secondLargestNumber();
		//characterCount();
		//anagramCheck();
		//System.out.println(isPalindrome());
		//pyramidPattern();
		nameReverser();
		
	}
}
