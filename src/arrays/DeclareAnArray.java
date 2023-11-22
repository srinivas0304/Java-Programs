package arrays;

public class DeclareAnArray 
{
	public static void main(String[] args)
	{
		int a[] = new int [5];
		a[0]=2;
		a[1]=6;
		a[2]=12;
		a[3]=14;
		a[2]=12;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int b[] = {5,6,1,2,8,7,9};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
