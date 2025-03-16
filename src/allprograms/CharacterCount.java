package allprograms;

public class CharacterCount 
{
	public static void main(String[] args) 
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
		System.out.println("The character appears: "+count);
	}
}
