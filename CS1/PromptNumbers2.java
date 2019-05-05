/*
 *  Modify your PromptNumbers program from the previous exercise so that it uses a static method to print the elements in forward order and another static method to print the array elements in backward order. The program's behavior should be the same as before.
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
 
 public class PromptNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int countInput = 0;
        int count = console.nextInt();
        int[] intArray = new int[count];
        
        for (int i = 0; i < count; i++) {
            // your code goes here; store the numbers
            System.out.print("Type a number: ");
            countInput = console.nextInt();
            intArray[i] = countInput;
        }
        
        System.out.println();

        forward(intArray, count);
        System.out.println();
        backward(intArray, count);
    }
    public static void forward(int [] intArray, int count){
        System.out.println("Your numbers in forward order:");
        for (int j = 0; j < count; j++) {
            System.out.println(intArray[j]);
        }
    }
    public static void backward(int [] intArray, int count){
        System.out.println("Your numbers in backward order:");
        for (int k = count - 1; k >= 0; k--) {
            System.out.println(intArray[k]);
        }
    }
}
