import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
	//Feb052024 lecture 
//	Write a Java program that takes two integers as input from the user and prints
//	the sum (addition), multiply, subtract, & divide of two numbers.
//	i.e.> OUTPUT :
//	First number is 10 and second number is 2. 10 + 2 = 12
	
	Scanner scr = new Scanner (System.in);
	int num1 = 0, num2 = 0, sum = 0, subtotal = 0, prod = 0, divQ = 0;
	double quote;
	System.out.println ("Enter First Number -> ");
	num1 = scr.nextInt();
// System.out.println "out" should be blue -> figure out why
//
	
	
	
		//	System.out,println(num1)
	
	System.out.println("Enter second number ->");
	num2 = scr.nextInt();
	
		//	System.out,println(num2)
	
// int/int will give an int,   divQ = (double)num1/num2; 
// double can be divided by an integer, integer division 
	// quot = ?
	
	sum = num1 + num2;
	prod = num1 * num2;
	subtotal = num1 - num2;
	
	System.out.println ("Sum is" + sum);
	System.out.println ("Prod is" + prod);
	System.out.println ("Subtotal is" + subtotal);
	


	}

}
