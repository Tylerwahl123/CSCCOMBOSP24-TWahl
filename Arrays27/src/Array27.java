import java.util.Scanner;

public class Array27 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("How many numbers in the Array?");
	int numbers = input.nextInt();
	int intArray[] = new int [numbers];
	for (int i = 0; i < numbers; i++) {
		System.out.println("Enter number");
		intArray[i] = input.nextInt();
	}
	System.out.println("Enter number check");
	int numCheck = input.nextInt();
	System.out.println(findValue(intArray, numCheck));
	}

	private static boolean findValue(int[] intArray, int numCheck) {
		for(int j = 0; j < intArray.length; j++) {
			if(intArray[j] == numCheck) {
				return true;
			}
		}
		return false;
	}
	
}
 