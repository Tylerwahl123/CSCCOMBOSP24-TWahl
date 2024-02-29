//You should create an array to hold the numbers.
//You should read in the numbers using a Scanner inside of a loop.
//You should stop the loop when the user enters a value of -1.
//You should loop through the array backwards printing each value.
//Do not print the -1 value or any unused areas of the array.

import java.util.Arrays;
import java.util.Scanner; 

public class ArrayTraversalReversal {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter nums, then enter -1 to end");
		int i = 0, num = input.nextInt();
		int intArray[] = new int [100];
		while (num != -1) {
			intArray[i] = num;
			num = input.nextInt();
			i++;
			
	}
		intArray = Arrays.copyOf(intArray, i);
		System.out.println(Arrays.toString(ReverseArray(intArray)));
}

	private static int[] ReverseArray(int[] intArray) {
		
		int temp, len = intArray.length;
		
			for(int i = 0; i < (len/2); i++) {
				temp = intArray[i];
				intArray[i] = intArray[len-i-1];
				intArray[len-i-1] = temp;
			}
	
		
		
		
		return intArray;
	}
}
