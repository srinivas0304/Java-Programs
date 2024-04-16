package practice;

public class Main 
{
	public static void main(String[] args) 
	{
		camelCase();
	}
	
	public static void pyramidPattern() {
		int num=5;
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static void reversePyramidPattern() {
		int num=5;
		for(int row=1;row<=num;row++) {
			for(int col=row;col<=num;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static void nameReverser() {
		String str="my name is srinivas";
		String[] str1=str.split(" ");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}
	}
	
	public static void stringReverseWhileLoop() {
		String str="Dhruva";
		int len=str.length()-1;
		while(len>=0){
			System.out.print(str.charAt(len));
			len--;
			
		}
	}
	
	public static void stringReverseForLoop() {
		String str="Dhruva";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void camelCase() {
		String str="my name is srinivas";
		String str1=toCamelCase(str);
		System.out.println(str1);
	}
		public static String toCamelCase(String input) 
		{
			String result="";
			boolean capitalize=true;
			for(char c:input.toCharArray()) {
				if(Character.isWhitespace(c)) {
					result +=c;
					capitalize=true;
				}
				else if(capitalize) {
					result +=Character.toUpperCase(c);
					capitalize=false;
				}
				else {
					result +=Character.toLowerCase(c);
				}
			}
			
			
			return result;
			
		}
		
		
	}
	

