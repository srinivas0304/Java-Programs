package strings;

public class CamelCase 
{
	public static void main(String[] args) 
	{
		String str="my name is srinivas";
		String str1=toCamelCase(str);
		System.out.println(str1);
	}
	public static String toCamelCase(String input) {
		String result="";
		boolean upperCase=true;
		for(char c:input.toCharArray()) {
			if(Character.isWhitespace(c)) {
				result +=c;
				upperCase=true;				
			}
			else if(upperCase) {
				result +=Character.toUpperCase(c);
				upperCase=false;
			}
			else {
				result +=Character.toLowerCase(c);
			}
		}
		return result;
	}
}
