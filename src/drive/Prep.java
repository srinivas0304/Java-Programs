package drive;

import java.util.Arrays;

public class Prep 
{
	public static void main(String[] args) {
		//secondLargestNumber();
		//System.out.println(palindromeCheck());
		characterCount();
	}
	
	
	public static void reverseArray()
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of an Array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void secondLargestNumber() {
		int[] arr=new int[] {2,5,100,98,45,73};
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
	
	public static void characterCount()
	{
		String str="testing";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='t')
			{
				count++;
			}
		}
		System.out.println("The Character Occured: "+count);
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
				System.out.println("The Given Strings are Anagram");
			}
		}
	}
}
