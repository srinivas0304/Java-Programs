package linkedin;

public class Main 
{
	public static void main(String[] args)
	{
		//reverseArray();
		//secondLargestNumber();
		//fibanocciSeries();
		System.out.println(primeNumber());
	}
	
	public static void reverseArray()
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Revers of an Array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void secondLargestNumber()
	{
		int[] arr=new int[] {2,5,74,98,45,100};
		int temp,num=6;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[num-2]);
	}
	
	public static void fibanocciSeries()
	{
		int num=5,a=0,b=0,c=1;
		for(int i=0;i<num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
		
	}
	
	public static boolean primeNumber()
	{
		int num=11;
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

