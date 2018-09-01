/*
 *  Consider the following Java method, which is written incorrectly. Under what cases will the method print the 
 *  correct answer, and when will it print an incorrect answer? What should be changed to fix the code? (For an 
 *  extra challenge, can you think of a way to write the code correctly without any if/else statements?)
 */

// This method should return how many of its three
// arguments are odd numbers.
public static void printNumOdd(int n1, int n2, int n3) {
    int count = 0;
    if (n1 % 2 != 0) {
        count++;
    } 
    if (n2 % 2 != 0) {
        count++;
    } 
    if (n3 % 2 != 0) {
        count++;
    }
    System.out.println(count + " of the 3 numbers are odd.");
}
