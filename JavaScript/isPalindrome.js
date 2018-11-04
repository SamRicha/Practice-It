/*
 *  Write a recursive function named isPalindrome that accepts a string parameter and returns true if the 
 *  string is the same forwards as backwards, ignoring capitalization. For example, the call of 
 *  isPalindrome("Taco cat") should return true.
 *  
 *  Constraints: Do not declare any global variables or any auxiliary data structures. Do not use any loops; 
 *  you must use recursion.
 */

function isPalindrome(word){
    if(word.length < 2){
        return true;
    }else if(word.toLocaleLowerCase().charAt(0) != word.toLocaleLowerCase().charAt(word.length-1)){
        return false;
    }else{
        return isPalindrome(word.slice(1,word.length-1));
    }
}
