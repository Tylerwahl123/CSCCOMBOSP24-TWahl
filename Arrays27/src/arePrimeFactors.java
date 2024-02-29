//Write a method named arePrimeFactors that takes an integer
//n and an array of integers, and that returns true if the numbers in the array
//are all prime and their product is n.
import java.util.Scanner; 



public class arePrimeFactors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers in the Array?");
		int numbers = input.nextInt();
		int intArray[] = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter number");
			intArray[i] = input.nextInt();
	}
		System.out.println("Enter product to check");
		int n = input.nextInt();
		System.out.println(arePrimeFactors(intArray, n));
		
}

	private static boolean arePrimeFactors(int[] intArray, int n) {
		int product = 1;
		for (int i = 0; i < intArray.length; i++) {
			product = product * intArray[i];
			for(int j = 2; j < intArray[i]+2; j++) {
				if(intArray[i] < 2) {
					i++;
				}
				else if(intArray[i]%j == 0) return false;
			}
		}
		if(n % intArray[i] == ) return true;
		else {
			return false;
		}
}
}