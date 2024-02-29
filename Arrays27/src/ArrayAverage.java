import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers in the Array?");
		int numbers = input.nextInt();
		int intArray[] = new int [numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter number");
			intArray[i] = input.nextInt();
		}
		System.out.println(ArrayAverage(intArray));
	}

	private static float ArrayAverage(int[] intArray) {
		int min = intArray[0], max = intArray[0], sum = 0;
		float avg;
		for(int i = 0; i < intArray.length;i++) {
			sum = sum + intArray[i];
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		sum = sum - max - min;
		avg = sum/(intArray.length-2);
		
		
		
		
		return avg;
	}
}
