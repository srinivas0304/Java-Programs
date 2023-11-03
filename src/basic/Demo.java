package basic;

import java.util.Random;

public class Demo
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		//generate random numbers
		
		int ran = random.nextInt(2147483647);
		System.out.println(ran);
	}
}
