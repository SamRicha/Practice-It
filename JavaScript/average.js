/*
 *  Write a function named average that accepts an array of numbers as a parameter and returns the average of all 
 *  of the numbers in the array. Recall that the average value of a collection of numbers is determined by the 
 *  overall sum of the values divided by the number of values in the collection. For example, if an array variable 
 *  named called nums stored the following values:
 *  
 *  var nums = [-1, 3.0, 12, 15, -4, 1, -12.5, 1, 8];
 *  Then the call of average(nums) should return 2.5 since that is the average of all of the values in the array.
 *  
 *  You may assume that the array passed to your function is non-empty and contains only number types.
 */

function average(nums){
    var avg = 0;
    for(var i = 0; i < nums.length; i++){
        avg += nums[i];
    }
    avg /= nums.length;
    return avg;
}
