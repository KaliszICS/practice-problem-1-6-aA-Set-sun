/*
	 File: Lesson 1.6: Intro to Booleans
	 Author: Angie
	 Date Created: February 20, 2026
	 Date Last Modified: February 20, 2026
	*/


	import java.util.Scanner;


public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		//Ask the user to "Input a boolean: ". Output the boolean.
		Scanner input = new Scanner(System.in);
		
		boolean bool;

		System.out.print("Input a boolean: ");
		bool = input.nextBoolean();
		System.out.println(bool);
		input.nextLine(); //clear scanner

		}

	public static void q2() {
		//Write question 2 code here
		//Ask the user to "Input an integer: ". Save the integer in a variable. Output true when the variable is greater than 5. false otherwise.
		
		Scanner input = new Scanner(System.in);
		int num;

		System.out.print("Input an integer: ");
		num = input.nextInt();
		System.out.println(num > 5);
		
		input.nextLine(); //clear scanner


	}


	public static void q3() {
		//Write question 3 code here
		//Ask the user to "Input pizza: ". Save the word in a variable. 
		// Output true when the variable is pizza. false otherwise.

		Scanner input = new Scanner(System.in);
		String pizza;

		System.out.print("Input pizza: ");
		pizza = input.nextLine();
		System.out.println(pizza.equals("pizza"));

	}

	public static void q4() {
		//Write question 4 code here
		/*Ask the user to "Input a number: ". 
		Save the number in a variable. 
		Output true when the number is equal to 0. false otherwise.
		*/

		Scanner input = new Scanner(System.in);
		
		double num;
		System.out.print("Input a number: ");
		num = input.nextDouble();
		System.out.println(num == 0);
	

	}

	public static void q5() {
		//Write question 5 code here
		/*Ask the user to "Input an integer: " Save the integer in a variable. 
		Output true when the variable is not 0. false Otherwise */

		Scanner input = new Scanner(System.in);
		int integer;

		System.out.print("Input an integer: ");
		integer = input.nextInt();
		
		System.out.print(integer != 0);
		System.out.print("\n");
		
		input.nextLine();

	}

	public static void q6() {
	/*Ask the user to "Input a word earlier than google: " Save the word in a variable. 
	Output true when the variable is earlier in the dictionary than google. false otherwise. */

	Scanner input = new Scanner(System.in);

	String oldWord;
	System.out.print("Input a word earlier than google: ");
	oldWord = input.nextLine();

	System.out.println(oldWord.compareTo( "google") < 0);
	


	}

}
