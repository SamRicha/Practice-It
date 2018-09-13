/*
 *  Write a method named digitRange that accepts an integer as a parameter and returns the 
 *  range of values of its digits. The range is defined as 1 more than the difference 
 *  between the largest and smallest digit value. For example, the call of digitRange(68437) 
 *  would return 6 because the largest digit value is 8 and the smallest is 3, so 8 - 3 + 1 = 6. 
 *  If the number contains only one digit, return 1. You should solve this problem without using 
 *  a String.
 */

public static int digitRange(int num){
    int max = 0;
    int min = 0;
    int count = 0;
    num = Math.abs(num);
    int extraNum = num;
    if(num < 10){
        return 1;
    }
    while(extraNum > 0){
        extraNum%= 10;
        if(count == 0){
            max = extraNum;
            min = extraNum;
        }else if(extraNum > max){
            max = extraNum;
        }else if(extraNum < min){
            min = extraNum;
        }
        extraNum = num / 10;
        num /= 10;
        count++;
    }
    
    int result = max - min + 1;
    return result;
}
