import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindCommon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers in the Array?");
		int numbers = input.nextInt();
		int intArray[] = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Entern number for 1st array");
			intArray[i] = input.nextInt();
		}
		int intArray2[] = new int [numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter number for 2nd array ");
			intArray2[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(FindCommon(intArray, intArray2)));
	}

	private static int[] FindCommon(int[] intArray, int[] intArray2) {
		int array3[] = new int[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == intArray2[i]) {
				array3[i] = intArray[i];
			}
		}
		return array3;
	}

}
