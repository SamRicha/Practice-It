/*
 *  Write a function named factorCount that accepts an integer (assumed to be positive) as its parameter 
 *  and returns a count of its positive factors. For example, the eight factors of 24 are 1, 2, 3, 4, 6, 8, 12, and 24, 
 *  so the call of factorCount(24) should return 8.
 */

function factorCount(num){
    var count = 0;
    for(var i = 0; i <= num; i++){
        if(i != 0 && num % i == 0){
            count = count + 1;
        }else{
        }
    }
    return count;
}
