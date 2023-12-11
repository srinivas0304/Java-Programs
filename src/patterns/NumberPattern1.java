package patterns;

public class NumberPattern1 
{
	public static void main(String[] args) 
	{
		patter1(5);
	}
	static void patter1(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
}
