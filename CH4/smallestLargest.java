/*
 *  Write a method named smallestLargest that asks the user to enter numbers, then prints the 
 *  smallest and largest of all the numbers typed in by the user. You may assume the user enters 
 *  a valid number greater than 0 for the number of numbers to read. Here is an example dialogue:
 *  
 *  How many numbers do you want to enter? 4
 *  Number 1: 5
 *  Number 2: 11
 *  Number 3: -2
 *  Number 4: 3
 *  Smallest = -2
 *  Largest = 11
 */

public static void smallestLargest(){
    int small = 0;
    int large = 0;
    int num = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int numAmount = scan.nextInt();
    for(int i = 1; i <= numAmount; i++){
        System.out.print("Number " + i + ": ");
        num = scan.nextInt();
        if(i == 1){
            large = small = num;
        }
        if(num >= large){
            large = num;
        }
        if(num <= small){
            small = num;
        }
    }
    System.out.println("Smallest = " + small);
    System.out.println("Largest = " + large);
}
