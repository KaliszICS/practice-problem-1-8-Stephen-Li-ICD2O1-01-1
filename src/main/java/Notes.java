import java.util.Scanner;

class Notes {
	public static void main(String args[]) {

		//Types of Errors

		//Syntax - Does not let your code run at all
		//Spelling mistakes
		//variables that don't exist
		//missing ;
		//missing ()
		//missing ""
		//variable was never declared
		//declare a variable that was already declared

		System.out.println("Hello World");
		int num;
		// int num;
		
		//Runtime - An Error that happens while they program is running/executing

		//division by zero
		//input mismatchexception - wrong data type input
		//situations where your code COULD be fine, but could also break if values change.

		// int num;
		// Scanner s = new Scanner(System.in);
		// num = s.nextInt();
		// System.out.println(5 / 0);

		//Logical - Errors where your does something other than it was intended to do.

		System.out.println(2 + 4 * 8); //add 2 and 4 then mulitply by eight
		//requires brackets
		System.out.println("Hello" + 4 + 8); //add 4 and 8 first, then concatenate to hello
		//requires brackets

		//using the wrong variable

		num = 4;
		int num1 = 3;
		int num2 = 8;

		//Output num1 and num2 added together
		System.out.println(num + num2);
		



		//How to fix or find solutions to errors

		//Fix the top error first

		//Read the line of the error

		//Read the text of the error
		//If you understand it, fix it
		//If you don't, look it up.

		//If it is a Syntax Error.  Follow the Arrow!


		// Escape Character - "\"

		//The character that follows has its operation changed in a string

		// "\n" - changes the n from an n to a newline character
		// \" - Quote no lone starts or ends a string, instead is just a quote character

		//  \t - tabs

		//  \\ - makes the escape character become a normal backslash
	}
}