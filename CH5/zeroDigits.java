/*
 *  Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number 
 *  that have the value 0. For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should return 
 *  0. The call zeroDigits(0) should return 1. You may assume that the integer is non-negative. (We suggest you use a
 *  do/while loop in your solution.)
 */

public static int zeroDigits(int num){
    int result = 0;
    String s = String.valueOf(num);
    for(int i = 0; i < s.length(); i++)
    {
     char ch = s.charAt(i);
     if(ch == '0')
        result ++;
    }
    return result;
}
