/*
 *  Write a method named reverse that accepts an array of integers as its parameter and reverses the order of the elements of the array. You may assume that the array passed is not null.
 *  
 *  For example, if the following arrays are passed:
 *
 *  int[] a1 = {11, 42, -5, 27, 0, 89};
 *  
 *  int[] a2 = {10, 20, 30, 40, 50};
 *  
 *  reverse(a1);
 *  
 *  reverse(a2);
 *  
 *  After the call, the arrays should store the following elements:
 *  
 *  a1: {89, 0, 27, -5, 42, 11}
 *  a2: {50, 40, 30, 20, 10}
 */

public static int[] reverse(int[] baseArray){
    int[] newArray = new int[baseArray.length];
    int base = 0;
    for(int i = baseArray.length - 1; i >= 0; i--){
        newArray[base] = baseArray[i];
        base++;
    }
    for(int i = 0; i < baseArray.length; i++){
        baseArray[i] = newArray[i];
    }
    return baseArray;
}
