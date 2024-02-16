//[92, ∞):  A
//[89, 92): A-
//[87, 89): B+
//[82, 87): B
//[79, 82): B-
//[77, 79): C+
//[72, 77): C
//[69, 72): C-
//[67, 69): D+
//[60, 67): D
//[0, 60):  F

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
			//switch statement or if statement
		System.out.println("Enter Numeric Grade");
		Scanner in = new Scanner(System.in);
		String grade = "";
		int g = 0;
		g = in.nextInt();
		System.out.println("g is equal to " + g );
		if (g >= 92) {
			grade = "A";
		} else if (g >= 89 && g < 92) {
			grade = "A-";
		} else if (g >= 87 && g < 89) {
			grade = "B+";
		} else if (g >= 82 && g < 87) {
			grade = "B"; 
		} else if (g >= 79 && g < 82) {
			grade = "B-";
		} else if (g >= 77 && g < 79) {
			grade = "C+";
		} else if (g >= 72 && g < 77) {
			grade = "C";
		} else if (g >= 69 && g < 72) {
			grade = "C-";
		} else if (g >= 67 && g < 72) {
			grade = "D+";
		} else if (g >= 60 && g < 67) {
			grade = "D";
		} else if (g >= 0 && g < 60) {
			grade = "F";
		}	
		System.out.println("Your letter grade is..." + grade);
	}
}
		 
		



