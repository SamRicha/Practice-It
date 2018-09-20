/*
 *  Write a method printBackwards that prints an array of integers in reverse order, in the following format.
 *  
 *  For the array {1, -3, 4, 7, 2}:
 *  
 *  element [4] is 2
 *  element [3] is 7
 *  element [2] is 4
 *  element [1] is -3
 *  element [0] is 1
 */

public static void printBackwards(int[] element){   
    int backwards = element.length-1;
    for(int i = 0; i < element.length; i++){
        System.out.println("element [" + backwards + "] is " + element[backwards]);
        backwards--;
    }
}
