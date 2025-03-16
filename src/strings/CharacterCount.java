package strings;

public class CharacterCount
{
	
	public static void CountCharacter()
	{
		String input="srinivas";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
//			if(input.charAt(i)!=' ')
//			{
//				count++;
//			}
			
			if(input.charAt(i)=='v')
			{
				count++;
			}
		}
		System.out.println("The character appears in given string "+count);
		//System.out.println("Total number of characters in given String "+count);
	}
	
	public static void main(String[] args) 
	{
		CountCharacter();
	}
		
}
