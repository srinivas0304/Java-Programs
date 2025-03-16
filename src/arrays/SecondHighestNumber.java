package arrays;

public class SecondHighestNumber 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,85,96,5,12,65};
		int temp, num=6;
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
}
