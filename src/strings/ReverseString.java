package strings;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//whileLoop();
		forLoop();
	}
	
	public static void whileLoop() 
	{
		String str="google";
		int len=str.length()-1;
		while(len>=0) {
			System.out.print(str.charAt(len));
			len--;
		}
	}
	
	public static void forLoop() {
		String str="dhruva";
		int len=str.length()-1;
		for(int i=len;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
}
