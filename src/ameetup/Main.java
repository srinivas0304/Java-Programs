package ameetup;

import java.util.Arrays;

public class Main 
{
	
	public static void main(String[] args) {
		//characterCount();
		//anagram();
		//System.out.println(isPrimeNumber());
		//System.out.println(isPalindrome());
		//nameReverser();
		//reverseString();
		//secondLargestNumber();
		//fibonacci();
		//reverseArray();
		//pattern();
		//numberPattern();
		duplicateNumbers();
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
		System.out.println("The apperance of character is "+count);
	}
	
	public static void anagram()
	{
		String str1="race";
		String str2="care";
		if(str1.length()!=str2.length())
		{
			System.out.println("Not a Anagram...");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("Give Strings are Anagram");
			}
			else
			{
				System.out.println("Not a Anagram...");
			}
		}
	}
	
	public static boolean isPrimeNumber()
	{
		int num=4;
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
	
	public static boolean isPalindrome()
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
			end --;
		}
		return true;
		
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
	
	public static void reverseString()
	{
		String str="hyderabad";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void secondLargestNumber()
	{
		//int[] arr=new int[6];
		int arr[]= {2,45,63,85,4,92};
		int num=6,temp;
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
	
	public static void fibonacci()
	{
		int a=0,b=0,c=1,num=5;
		for(int i=0;i<num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}
	
	public static void reverseArray()
	{
		int arr[]= {1,2,3,4,5};
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
	
	public static void pattern()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void numberPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void duplicateNumbers()
	{
		int arr[] = {5,4,1,2,4,9,2};
		System.out.println("The Duplicate numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}
