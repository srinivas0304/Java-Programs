package drive;

public class StringCode
{
	public static void stringRevser()
	{
		String str="hyderabad";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void vowelsAndConsonants()
	{
		String str="my name is srinivas";
		str=str.toLowerCase();
		int vCount=0,cCount=0;
		for(int i=0;i<str.length();i++)
		{
			//checks whether a character is a vowel
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				cCount++;
			}
		}
		System.out.println("Number of vowels "+vCount);
		System.out.println("Number of consonants "+cCount);
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
	public static void main(String[] args) {
		//stringRevser();
		//vowelsAndConsonants();
		nameReverser();
	}
}
