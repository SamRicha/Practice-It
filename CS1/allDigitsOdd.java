/*
 *  Write a method named allDigitsOdd that returns whether every digit of an integer is odd. 
 *  Your method should return true if the number consists entirely of odd digits and false if 
 *  any of its digits are even. 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
 *  
 *  For example, here are some calls to your method and their expected results:
 */

public static boolean allDigitsOdd(int num){
    boolean result = false;
    num = Math.abs(num);
    String numString = "" + num;
    for(int i = 0; i < numString.length(); i++){
        if((Integer.parseInt(numString.substring(i,i+1))) % 2 != 0){
            result = true;
        }else{
            result = false;
            break;
        }
    }
    return result;
}
