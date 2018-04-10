/*
* It's common to print a rotating, increasing list of single-digit numbers at the start of a program's output as 
* a visual guide to number the columns of the output to follow. With this in mind, write nested for loops to 
* produce the following output, with each line 60 characters wide:
*/

/*
*          |         |         |         |         |         |
* 123456789012345678901234567890123456789012345678901234567890
*/

public class NumbersOutput60 {
  public static void main (String[] args){
    for (int i = 0; i <= 5; i++) {
			for (int k = 0; k <= 8; k++) {
				System.out.print(" ");
			}
			System.out.print("|");
		}
		System.out.println();
		int h = 0;
		for (int j = 0; j <= 60; j++) {

			if (j % 10 == 0 && j != 0) {
				h = 0;
				System.out.print(h);
			} else if (j == 0) {
				System.out.print("");
			} else {
				h++;
				System.out.print(h);
			}
		}
  }
}
