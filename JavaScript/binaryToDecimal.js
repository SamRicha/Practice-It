/*
 *  Write a function named binaryToDecimal that accepts an integer parameter whose digits 
 *  are meant to represent binary (base-2) digits, and returns an integer of that number's 
 *  representation in decimal (base-10). For example, the call of binaryToDecimal(101011) should return 43.
 *  
 *  If you find your solution returning unexpected double values, remember that JavaScript
 *  will convert integer (whole number) values to double values when divided by a number 
 *  that is not a factor. You can avoid this conversion by using JavaScript's parseInt function 
 *  which converts any number to an integer value. For example, the call of parseInt(2.13333) would return 2.
 *  
 *  Constraints: Do not use a string in your solution.
 */

function binaryToDecimal(binary){
    var number = 0;
    var binaryDivider = 100000000;
    var decimalNumber = 256;
    
    for(var i = 0; i < 9; i++){ 
        if(Math.floor(binary / binaryDivider) == 1){
            number += decimalNumber;
            binary -= binaryDivider; 
        }else{}
        decimalNumber /= 2;
        binaryDivider /= 10;        
    }
    return  parseInt(number);
}
