package strings;

public class NameReverser 
{
	public static void main(String[] args) {
		String str="my name is srinivas";
		String[] rev=str.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]+" ");
		}
	}
}
