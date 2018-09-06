/*
 *  Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and 
 *  an integer exponent as parameters and returns the base raised to the given power. Your code should work 
 *  for both positive and negative exponents. For example, the call pow2(2.0, -2) returns 0.25. Do not use 
 *  Math.pow in your solution.
 */

public static double pow2(double base, double power){
    double result = base;
    if(power == 0){
        base = 1;
        result = base;
    }else if(power < 0){
        result = 1.0/base;
        for(int i = 1; i < -1*power; i++){
            result /= base;
        }
    }else{
        for(int i = 1; i < power; i++){
            result*= base;
        }
    }
    return result;
}
