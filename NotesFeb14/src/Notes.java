
public class Notes {
//	c2 = F2C(f2)     
//	c3 = F2C(f3)

//	*Example 2*
//Public class Exercise1 (

//public static void main(String[] args) {
//Scanner scr = new Scanner(System.in) ;								*
//int num1, num2, sum;														
//
//	
//System.out.println("Enter two numbers => ") ;
//num1 = scr.nextInt();
//num2 = scr.nextInt();
//
//sum = add(num1, num2);
//
//System.out.println("Result of adding " + num1 + 
//	" & " + num2 " is "+sum);
//scr.close();
//public static int add(int a, int b) {
//return a + b;
//}

//	*Switch Statement Example*
//switch (food) {
//case "apple":
//case "banana":
//case "cherry":
//System.out.println("Fruit!");
//break;
//case "asparagus":
//case "broccoli":
//case "carrot" :
//System.out.println("Vegetable!");
//break;
//
//		*Formatting output*
//-output a double by using print or println, it displays up to 16 decimal places
//-System.out provides a method called printf, (more control of the format)
//-"f" in printf = "formatted"
//- The first value in parentheses is a format string that specifies how the output would be displayed
//- Can be combined with reg. string followed by format specifier
//			System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
//					OUTPUT:  Four Thirds = 1.333
//-no newline after printf (similar to Print); thus, format strings often end with /n
//-values will be matched with format specifiers in order

//
//
//
//									*Week 5 Notes*
//- Loop MUST have 3 things: 
//-Initialization : runs once at the beginning of the loop (loop control variable, counter)
//-Condition : checked each time through the loop. If false the loop ends (true or false)
//-Iteration : at the end of each loop, the update runs to update/change the variable
//for (initialization; condition; iteration) {
////Loop body
////Executes if expression evaluated to TRUE
////Update condition value
////After body, execution jumps to the "for"
//}
////Statements that execute after the expression evaluates to false

//								*For Loop* 
//int i; 
//for (i=0;<5;i++) {
//	System.out.println("counting up i" +i);
//	if (i==0) {
//			System.out.println("what's up!");
//	}
//	else if (i==2) {
//			System.out.println("it's a TWO");
//	}
//	else {
//	System.out.println("everything else");
//	}
//}
//System.out.println("so what's i now?" +i);
								
//								*Nested Loops* 
//-x and y in the loop above are called loop variables. They control the exectution of the loop.
//-The first loop (loop variable x) is called the "outer loop", and the second loop (loop variable y) is called the "inner loop"
//for (int x =1; x <= 10; x++) {
//	for (int y = 1; y <= 10; y++) {
//		System.out.println("%4d, x*y");
//	}
//	System.out.println();
//}

//								*length() and charAt()*
//-Strings provide a method called length that returns the numbers of characters in the string
//-The characters start from a position 0 to (length - 1)\
//									*example*
//	for (int i = 0; i <fruit.length(); i++) {
//		char letter = fruit.charAt(i);
//		System.out.println(letter);
//	}
//	int length = fruit.length();
//	char last = fruit.charAt(length - 1);
//

//								*Empty Strings and Appending Strings*
//public static String reverse(String s) {
//	String r = "";
//	for (int i = s.length() - 1; i >= 0; i--) {
//		r += s.charAt(i);
//	}
//	return r;

//								*indexof() Method*
//-indexOf() returns the index of the first appearance
//	String fruit = "banana";
//	int index = fruit.indexOf('a');     //returns 1
//				or
//	int index = fruit.indexOf('a', 2);  //returns 3

//	}
//								*String Comparision*
//-The correct way to compare strings is with the equals method. like this:
//if (anser.equals("yes")) {
//	System.out.println("Let's go!");
//}
//
//								*in class notes*
// num = 2/3 = 0   |  num = 2/3.0 = .66
	
//	main{
//	SOP(addTwo(3,4))
//	num2 = addTwo(3,4)
//	static int add Two(into a, int b){
//		return a + b;
	
//	for(int i = o; i<; i ++)
//	int i = 0;
//	while(i <10)
//		i++;
	
//	x=6;
//	y=10;
	
//	if(y>x){
//		SOP("Y is greater")
//	}
//	else
//	{
//		SOP("X is greater");
//  }
//	
//	Scanner input...
//	Output "What is my number"
//	int myNum= input.nextInt();
//  
//
