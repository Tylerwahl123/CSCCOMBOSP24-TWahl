import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class ArrayShuffle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers in the Array?");
		int numbers = input.nextInt();
		int intArray[] = new int [numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter number");
			intArray[i] = input.nextInt();

	}
		System.out.println(Arrays.toString(ArrayShuffle(intArray)));

}

	private static int[] ArrayShuffle(int[] intArray) {
		Random rand = new Random();
		int temp, len = intArray.length;
		
		for (int i = 0; i < intArray.length; i++) {
			int randomNum = rand.nextInt(len);
			temp = intArray[i];
			intArray[i] = intArray[randomNum];
			intArray[randomNum] = temp;
			
			
		}
		return intArray;
	}
}