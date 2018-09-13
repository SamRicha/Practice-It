/*
 *  Write a method named digitSum that accepts an integer as a parameter and returns the sum of the digits of that number. 
 *  For example, digitSum(29107) returns 2+9+1+0+7 or 19. For negative numbers, return the same value that would result if 
 *  the number were positive. For example, digitSum(-456) returns 4+5+6 or 15.
 */

public static int digitSum(int num){
    int result = 0;
    num = Math.abs(num);
    String numString = "" + num;
    for(int i = 0; i < numString.length(); i++){
        result += Integer.parseInt(numString.substring(i,i+1));
    }
    return result;
}
