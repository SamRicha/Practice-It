/*
 *  Write a recursive function named exponent that accepts two integers representing a base and an exponent and returns 
 *  the base raised to that exponent. For example, the call of exponent(3, 4) should return 34 or 81. If a negative 
 *  exponent is passed, the function should throw an error with the message, "exponent should be non-negative".
 *  
 *  Do not use loops or auxiliary data structures; solve the problem recursively.
 */

function exponent(intOne, intTwo){
    if(intTwo < 0){
        throw("exponent should be non-negative");
    }else if(intTwo == 0){
        return 1;
    }else{
        return intOne * exponent(intOne, intTwo - 1);
    }
}
