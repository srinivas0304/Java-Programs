package arrays;

import java.util.HashMap;
import java.util.Map;

public class CombineTwoArrays 
{

	  public static void main(String[] args) {
	    int[] array1 = {1, 4, 3};
	    int[] array2 = {2, 5, 6};

	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i : array1) {
	      map.put(i, i);
	    }
	    for (int i : array2) {
	      map.put(i, i);
	    }

	    int[] mergedArray = new int[map.size()];
	    int i = 0;
	    for (int key : map.keySet()) {
	      mergedArray[i++] = key;
	    }

	    for (int j = 0; j < mergedArray.length; j++) {
	      System.out.println(mergedArray[j]);
	    }
	}
}

