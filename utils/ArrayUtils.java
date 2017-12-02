package utils;

public class ArrayUtils{
	
public static int[] reverse (int[] array) {
		
	int[] arr = new int[array.length];
		
	for(int i=0; i<array.length; i++) {
			
		arr[i] = array[array.length-1 - i];
			
	}
		
	return arr;
	
	}

public static String stringifyArray (int[] myArr) {
	
	String result = "";
	for(int j=0; j<myArr.length-1; j++) {
		
		result = result + myArr[j] + ", ";
	}
	
	return result + myArr[myArr.length-1];
	
}


}


	