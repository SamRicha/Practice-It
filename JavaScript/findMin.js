/*
 *  Write a function named findMin that accepts an array of numbers as a parameter and returns the smallest number 
 *  in the array. For example, if an array variable named called nums stored the following values:
 *
 *  var nums = [-1, 3.2, 12, 15, -4, 1, -12.5, 1, 8];
 *  Then the call of findMin(nums) should return -12.5 since that is the smallest numerical value in the array.
 *
 *  You may assume that the array passed to your function is non-empty and contains only number types.
 */

function findMin(nums){
    var min = nums[0];
    for(var i = 0; i < nums.length; i++){
        if(nums[i] < min){
            min = nums[i];
        }
    }
    return min;
}
