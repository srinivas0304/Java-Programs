package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = scanner.nextInt();
		int[] num = new int[size];
		System.out.println("Enter elements of an array");
		for(int i=0;i<size;i++) {
			num[i]=scanner.nextInt();
		}
		List<Integer> arr = new ArrayList<Integer>();
		for(int i:num) {
			arr.add(i);
		}
		miniMaxSum(arr);
		
	}
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	    int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    long sum=0;
	   
	    for(Integer number:arr){
	        if(number<min){
	            min=number;
	        }
	        if(number>max){
	            max=number;
	        }
	        sum+=number;
	    }
	    System.out.println(String.format("%d %d", sum-max, sum-min));

	    }
}
