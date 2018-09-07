/*
 *  Write a method named numUnique that takes three integers as parameters and that returns the number of 
 *  unique integers among the three. For example, the call numUnique(18, 3, 4) should return 3 because the 
 *  parameters have 3 different values. By contrast, the call numUnique(6, 7, 6) would return 2 because 
 *  there are only 2 unique numbers among the three parameters: 6 and 7.
 */

public static int numUnique(int num1, int num2, int num3){
    int result = 0;
    if(num1 != num2 && num1 != num3 && num2 != num3){
        result = 3;
    }else if(num1 == num2 && num1 == num3){
        result = 1;
    }else if(num1 == num2 && num1 != num3 || num1 != num2 && num1 == num3 ||
            num3 == num2 && num3 != num1 || num3 != num2 && num3 == num1){
        result = 2;
    }
    return result;
}
