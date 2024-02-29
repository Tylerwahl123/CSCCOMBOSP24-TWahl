import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers in the Array?");
		int numbers = input.nextInt();
		int intArray[] = new int [numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter number");
			intArray[i] = input.nextInt();
		}
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
