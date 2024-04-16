package polymorphism;

public class Calculations 
{
	public void add2Numbers() {
		
	}
	
	/*
	 * public void add() {
	 * 
	 * }//Duplicate method add() in type Calculations
	 */
	
	public void add3Numbers() {
		
	}
	
	/* If we write method names like above one, end user must know that these methods were named as above. Not a good practice*/
	
	
	
	//This is called as method overloading, 
	public int add(int a, int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers is: "+ sum);
		return sum;
	}
	
	public int add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("Addition of three numbers is: "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Calculations c=new Calculations();
		c.add(15, 18);
		c.add(15, 15, -1);
		//best example for method overloading is print(), print(boolean), print(char).....etc.,
		
	}
}
