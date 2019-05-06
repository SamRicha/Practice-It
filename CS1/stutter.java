/*
 *  Write a method named stutter that accepts an array of integers as its parameter and returns a new array with two consecutive copies of each value from the original array. You may assume that the array passed is not null.
 *  
 *  For example, if the following array is passed:
 *  
 *  int[] a = {11, -4, 0, 777};
 *  int[] stuttered = stutter(a);
 *  After the call, the array stuttered should store the elements {11, 11, -4, -4, 0, 0, 777, 777}. You should not modify the array that is passed in.
 */
 
 public int[] stutter(int[] baseArray){
    int baseLengthDouble = baseArray.length*2;
    int[] newArray = new int[baseLengthDouble];
    int counter = 0;
    for(int i = 0; i < baseLengthDouble; i++){
        newArray[i] = baseArray[counter];
        if(i % 2 != 0){
            counter++;
        }
    }
    return newArray;
}
