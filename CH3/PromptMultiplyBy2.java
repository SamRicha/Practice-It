/*
 *	Write code to read an integer from the user, then print that number 
 *	multiplied by 2. You may assume that the user types a valid integer. 
 *	A sample run of the code would produce the following
 */

/*	Type an integer: 4
 * 	4 times 2 = 8 
 * 
 */
import java.util.Scanner;

public class PromptMultiplyBy2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Type an integer: ");
		int number = scan.nextInt();
		int newNumber = number * 2;
		System.out.println(number + " times 2 = " + newNumber);
	}
}
