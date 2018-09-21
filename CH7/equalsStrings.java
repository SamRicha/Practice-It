/*
 *  Write a method called equals that takes in two string arrays and returns true if they are equal; that is, 
 *  if both arrays have the same length and contain equivalent string values at each index.
 *  
 *  (If you like, you may look at the equals method developed in section 7.2 of the Building Java Programs textbook 
 *  as a reference. The version in that book section compares arrays of integers instead of strings.)
 */

public static boolean equals(String[] list1, String[] list2){
    if(list1.length != list2.length){
        return false;
    }
    for(int i = 0; i < list1.length; i++){
        if(list1[i].equals(list2[i]) != true){
            return false;
        }
    }
    return true;
}
