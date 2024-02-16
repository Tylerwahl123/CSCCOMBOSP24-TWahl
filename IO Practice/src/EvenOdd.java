import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	// Feb05 2024
//	Write a Java program that takes an integer as input from the user and
//	determines whether it's an even or odd number.
//	i.e.> OUTPUT :
//	56 is EVEN number.
	
	//get help lol 
	
	Scanner scr = new Scanner(System.in);
	int num;
	int ans = 1;
	
	while (ans ==1) { 
	System.out.println ("What number do you have");
	num = scr.nextInt(); 
	System.out.println(num);
	
	if ((num % 2) == 0) {
		System.out.println(num + " Even number");
	} else {
		System.out.println(num + "Odd number");
		
	}
	System.out.println("do you want to input another number (1) or (0)");
		
		ans = ans + scr.nextInt();
	}
	}
}
