/*
 *  Write a method named diceSum that prompts the user for a desired sum, then repeatedly rolls two six-sided dice 
 *  until their sum is the desired sum. Here is the expected dialogue with the user:
 *  
 *  Desired dice sum: 9
 *  4 and 3 = 7
 *  3 and 5 = 8
 *  5 and 6 = 11
 *  5 and 6 = 11
 *  1 and 5 = 6
 *  6 and 3 = 9
 *  (Because this problem uses random numbers, our test cases check only the general format of your output. You must still 
 *  examine the output yourself to make sure the answer is correct.)
 */

public static void diceSum(){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int dice1 = 0;
    int dice2 = 0;
    System.out.print("Desired dice sum: ");
    int sumStop = scan.nextInt();
    while(dice1 + dice2 != sumStop){
        dice1 = rand.nextInt(6)+1;
        dice2 = rand.nextInt(6)+1;
        System.out.println(dice1 + " and " + dice2 + " = " + (dice1+dice2));
    }    
}
