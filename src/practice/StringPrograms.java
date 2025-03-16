package practice;

public class StringPrograms 
{
	public static void main(String[] args) {
		//nameReverser();
		//stringReverserForLoop();
		//stringReverserWhileLoop();
		alphabetorNot();
	}
	
	public static void nameReverser() {
		String str="my name is srinivas";
		String[] str1=str.split(" ");
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
		}
	}
	
	public static void stringReverserForLoop() {
		String str="hyderabad";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void stringReverserWhileLoop() {
		String str="Hyderabad";
		int len=str.length()-1;
		while(len>=0) {
			System.out.print(str.charAt(len));
			len--;
		}
	}
	static void alphabetorNot() {
		String input="NaveenAutomationLabs";
		char[] arr=input.toCharArray();
		boolean ans=false;
		for(int i=0;i<arr.length-1;i++) {
			ans=Character.isAlphabetic(arr[i]);
		}
		System.out.println(ans);
	}
	
	
}
