import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers in the Array?");
		int numbers = input.nextInt();
		int intArray[] = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter number");
			intArray[i] = input.nextInt();
		}
		System.out.println(FindEvenOdd(intArray));
	}

	private static String FindEvenOdd(int[] intArray) {
		int count = 0;
		int countOdd = 0;
		String str = "";
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 0) {
				count++;
			} else
				countOdd++;

		}
		str += "There are " + count + " even numbers and " + countOdd + " odd numbers in the array";
		return str;
	}
}
