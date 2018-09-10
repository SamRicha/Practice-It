/*
 *  Write a method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers 
 *  is the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method 
 *  should return false if no such midpoint relationship exists.
 *  
 *  The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd. You must check all cases.
 *  
 *  Calls such as the following should return true:
 *  
 *  hasMidpoint(4, 6, 8)
 *  hasMidpoint(2, 10, 6)
 *  hasMidpoint(8, 8, 8)
 *  hasMidpoint(25, 10, -5)
 *  Calls such as the following should return false:
 *  
 *  hasMidpoint(3, 1, 3)
 *  hasMidpoint(1, 3, 1)
 *  hasMidpoint(21, 9, 58)
 *  hasMidpoint(2, 8, 16)
 */

public static boolean hasMidpoint(int num1, int num2, int num3){
    boolean result = false;
    if((num1 + num3)/2 == num2){
        result = true;
    }else if((num1 + num2)/2 == num3){
        result = true;
    }else if((num2 + num1)/2 == num3){
        result = true;
    }else if((num2 + num3)/2 == num1){
        result = true;
    }else if((num3 + num1)/2 == num2){
        result = true;
    }else if((num3 + num2)/2 == num1){
        result = true;
    }
    return result;
}
