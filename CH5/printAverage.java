/*
 *  Write a method named printAverage that accepts a Scanner for the console as a parameter and repeatedly prompts 
 *  the user for numbers. Once any number less than zero is typed, the average of all non-negative numbers typed is 
 *  displayed. Display the average as a double, and do not round it. For example, a call to your method might look like this:
 *  
 *  Scanner console = new Scanner(System.in);
 *  printAverage(console);
 *  The following is one example log of execution for your method:
 *  
 *  Type a number: 7
 *  Type a number: 4
 *  Type a number: 16
 *  Type a number: -4
 *  Average was 9.0
 *  If the first number typed is negative, do not print an average. For example:
 *  
 *  Type a number: -2
 */

public static void printAverage(Scanner scan){
    int num = 0; 
    double doubleCount = 0.0;
    int sum = 0;
    double avg = 0.0;
    while(num >= 0){
        System.out.print("Type a number: ");
        num = scan.nextInt();
        if(num >=0){
            sum += num;
            doubleCount += 1.0;
        }
    }
    avg = sum/doubleCount;
    if(avg > 0){
        System.out.println("Average was " + avg);
    }
}
