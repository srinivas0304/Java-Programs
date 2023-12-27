package patterns;

public class Pattern1 
{
	public static void main(String[] args)
	{
		Pattern1.pattern9();
	}
	
	public static void pattern1() 
	{
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern3() {
		for(int i=0;i<4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern4() {
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	public static void pattern5() {
		int n=4;
		int m=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 || j==0 || i==n || j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern6() {
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	public static void pattern7() {
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	
	public static void pattern8() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i || j==n-i+1) {
					System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern9() {
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(i>=1 && i<n-1 && j==1 || i==n-2 && j>1) {
					System.out.print("*");
					}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}
	
	
	
}
