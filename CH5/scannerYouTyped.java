/*
 *  Write a piece of code that prompts the user for a number and then prints a different message 
 *  depending on whether the number was an integer or a real number. Here are two sample dialogues:
 *  
 *  Type a number: 42.5
 *  You typed the real number 42.5
 *  Type a number: 3
 *  You typed the integer 3
 */

Scanner console = new Scanner(System.in);
System.out.print("Type a number: ");
if(console.hasNextInt()){
    int numInt = console.nextInt();
    System.out.print("You typed the integer " + numInt);
}else if(console.hasNextDouble()){
    double numDouble = console.nextDouble();
    System.out.print("You typed the real number " + numDouble);
}
