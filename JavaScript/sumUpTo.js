/*
 *  Write a function named sumUpTo that accepts an integer parameter n and returns the sum of the integers 
 *  from 1 through n inclusive. For example, sumUpTo(5) returns 15, since 1 + 2 + 3 + 4 + 5 = 15. You may 
 *  assume that the value of n is at least 1.
 */
 
 function sumUpTo(n){
    var sum = 0;
    for(var i = 0; i <= n; i++){
        sum = sum + i;
    }
    return sum;
}
