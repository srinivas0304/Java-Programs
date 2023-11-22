package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = scanner.nextInt();
		int[] num=new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<size;i++) {
			num[i]=scanner.nextInt();
		}
		List<Integer> arr = new ArrayList<Integer>();
		for(int i:num) {
			arr.add(i);
			
		}		
		plusMinus(arr);
	}
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    double a=0;
	    double countp=0;
	    double countz=0;
	    double countn=0;
	    a=arr.size();
	    for(int i=0;i<a;i++){
	    
	        if(arr.get(i)>0){
	            countp++;
	        }
	        else if(arr.get(i)<0){
	            countn++;
	        }
	        else{
	            countz++;
	    }  
	}
	    double ps=countp/a;
	    double np=countn/a;
	    double zp=countz/a;
	    
	    System.out.println(ps);
	    System.out.println(np);
	    System.out.println(zp);
	    }

}
