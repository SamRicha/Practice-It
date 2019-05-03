/*
 *  The program is supposed to prompt the user to enter several integers, store them into an array, then print those integers back out in forwards and backwards order. Finish the program so that it runs properly. Make your program flexible enough that it will work no matter how many integers the user wants to type.
 *  
 *  How many numbers will you enter? 4
 *  Type a number: 12
 *  Type a number: 8
 *  Type a number: -2
 *  Type a number: 39
 *  
 *  Your numbers in forward order:
 *  12
 *  8
 *  -2
 *  39
 *  
 *  Your numbers in backward order:
 *  39
 *  -2
 *  8
 *  12
 */
 
public class PromptNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int countInput = 0;
        int count = console.nextInt();
        int[] intArray = new int[count];
        
        for (int i = 0; i < count; i++) {
            // your code goes here; store the numbers
            System.out.print("Type a number: ");
            countInput = console.nextInt();
            intArray[i] = countInput;
        }
        
        System.out.println();
        System.out.println("Your numbers in forward order:");
        
        for (int j = 0; j < count; j++) {
            // your code goes here; print the numbers in forward order
            System.out.println(intArray[j]);
        }

        System.out.println();
        System.out.println("Your numbers in backward order:");
        
        // your code goes here; print the numbers in forward order
        for (int k = count - 1; k >= 0; k--) {
            System.out.println(intArray[k]);
        }
    }
}
