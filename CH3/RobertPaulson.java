/*
 *  Write code that prompts the user for a phrase and a number of times to repeat it, then 
 *  prints the phrase the phrase that many times. Here is an example dialogue with the user:
 */

/*
 *  What is your phrase? His name is Robert Paulson
 *  How many times should I repeat it? 3
 *  His name is Robert Paulson
 *  His name is Robert Paulson
 *  His name is Robert Paulson
 */
import java.util.Scanner;

public class RobertPaulson{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your phrase? ");
        String phrase = scan.nextLine();
        System.out.print("How many times should I repeat it? ");
        int phraseRepeats = scan.nextInt();
        for(int i = 0; i < phraseRepeats; i++){
            System.out.println(phrase);
        }
    }
}
