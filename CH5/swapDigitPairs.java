/*
 *  Write a method named swapDigitPairs that accepts a positive integer n as a parameter and returns a new integer whose 
 *  value is similar to n's but with each pair of digits swapped in order. For example, the call of swapDigitPairs(482596) 
 *  would return 845269. Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. If the number contains 
 *  an odd number of digits, leave the leftmost digit in its original place. For example, the call of swapDigitPairs(1234567) 
 *  would return 1325476. You should solve this problem without using a String.
 */

public static int swapDigitPairs(int number) {
    int result = 0;
    int place = 1;
    while (number > 9) {
        result += place * 10 * (number % 10);
        number /= 10;
        result += place * (number % 10);
        number /= 10;
        place *= 100;
    }
    return result + place * number;
}
