/*
 *  Write a method named evenNumbers that accepts a Scanner as a parameter reading input from a file containing a 
 *  series of integers, and report various statistics about the integers. You may assume that there is at least one 
 *  integer in the file. Report the total number of numbers, the sum of the numbers, the count of even numbers and 
 *  the percent of even numbers. For example, if a Scannerinput on file numbers.txt contains the following text:
 *  
 *  5 7 2 8 9 10 12 98 7 14 20 22
 *  then the call evenNumbers(input); should produce the following output:
 *  
 *  12 numbers, sum = 214
 *  8 evens (66.67%)
 */

public static void evenNumbers(Scanner scan){
    int numCount = 0;
    int evenCount = 0;    
    int sum = 0;
    int num = 0;
    double evenPercent = 0.0;
    while(scan.hasNextInt()){
        numCount++;
        num = scan.nextInt();
        if(num % 2 == 0){
            evenCount++;
        }
        sum += num;
    }
    double percent = (double)(evenCount * 100)/numCount;
    System.out.println(numCount + " numbers, sum = " + sum);
    System.out.printf(evenCount + " evens (%.2f%%)",percent);
}
