package arrays;

import java.util.HashMap;
import java.util.Map;

public class MergeAndSortArrayTwoIntegers 
{
	public static void main(String[] args) 
	{
		int[] array1= {2,4,5,6};
		int[] array2= {7,1,8,9};
		Map<Integer, Integer> map=new HashMap<>();
		for(int i:array1) {
			map.put(i, i);
		}
		for(int i:array2) {
			map.put(i, i);
		}
		int[] mergeArray = new int[map.size()];
		int i=0;
		for(int key:map.keySet()) {
			mergeArray[i++]=key;
		}
		
		//desecnding order
//		for(int j=mergeArray.length-1;j>=0;j--) { 
//			System.out.println(mergeArray[j]);
//		}
		
		for(int j=0;j<mergeArray.length;j++) {
			System.out.println(mergeArray[j]);
		}
		//System.out.println(Arrays.toString(mergeArray));
	}
}
