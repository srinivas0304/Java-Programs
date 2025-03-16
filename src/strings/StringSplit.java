package strings;

public class StringSplit 
{
	public static void main(String[] args) 
	{
		String str="india is great country";
		String[] arr=str.split(" ");
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()==arr[j].length())
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;					
				}
			}
		}
		for(String s:arr)
		{
			System.out.print(s+" ");
		}
	}
}
