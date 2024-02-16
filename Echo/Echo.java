import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		String line;
		int num1 = 23, num2; 
				
		Scanner in = new Scanner(System.in); 

		
		System.out.print("Type number: ");
		num2 = in.nextInt();
		System.out.println("You typed " + num2);
		in.nextLine();
	
		line = in.nextLine();
		System.out.println("You said: " + line);
		
	System.out.print("Type something else; ");
	line = in.nextLine();
	System.out.println("You also said: " +line); 
		// TODO Auto-generated method stub

	}

}
