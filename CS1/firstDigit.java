/*
 *  Write a method named firstDigit that returns the first digit of an integer. For example, 
 *  firstDigit(3572) should return 3. It should work for negative numbers as well. For example, 
 *  firstDigit(-947) should return 9.
 */

public int firstDigit(int num){
    int newNum = Math.abs(num);
    while (newNum >= 10) 
        newNum /= 10;
    return newNum;
}
