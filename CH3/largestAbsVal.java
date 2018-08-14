/*
 *  Write a method largestAbsVal that accepts three integers as parameters and returns the 
 *  largest of their three absolute values. For example, a call of largestAbsVal(7, -2, -11) 
 *  would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
 */
 
 public int largestAbsVal(int num1, int num2, int num3){
    int absNum1 = Math.abs(num1);
    int absNum2 = Math.abs(num2);
    int absNum3 = Math.abs(num3);
    if(absNum1 >= absNum2 && absNum1 >= absNum3)
        return absNum1;
    else if(absNum2 >= absNum1 && absNum2 >= absNum3){
        return absNum2;
    }
    else{
        return absNum3;
    }
}
