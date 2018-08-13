/*
 *  Consider the following program. Modify the given SumNumbers code to use a Scanner to prompt the user for the values of low and high. 
 *  The following is a sample execution in which the user asks for the sum of the values 1 through 10:
 */
 
 /*
  * low? 1
  * high? 10
  * sum = 55
  */

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("low? ");
        int low = scan.nextInt();
        System.out.print("high? ");
        int high = scan.nextInt();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.print("sum = " + sum);
    }
}
