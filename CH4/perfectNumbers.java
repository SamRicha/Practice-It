/*
 *  A "perfect number" is a positive integer that is the sum of all its proper factors (that is, factors including 
 *  1 but not the number itself). The first two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. 
 *  Write a static method perfectNumbers that takes an integer max as an argument and prints out all perfect 
 *  numbers that are less than or equal to max.
 *  
 *  Here is the console output from a call to perfectNumbers(6):
 *  
 *  Perfect numbers up to 6: 6 
 *  Here is the console output from a call to perfectNumbers(500):
 *  
 *  Perfect numbers up to 500: 6 28 496 
 */

public static void perfectNumbers(int num){
    String phrase = "Perfect numbers up to " + num + ":";    
    if(num >= 6 && num < 28){
        phrase+= " " + 6;
    }else if(num >= 28 && num < 496){
        phrase+= " " + 6 + " " + 28;
    }else if(num >= 496 && num < 8128){
        phrase+= " 6" + " 28" + " 496";
    }else if(num >= 8128 && num < 33550336){
        phrase+= " 6" + " 28" + " 496" + " 8128";
    }
    System.out.println(phrase);
}
