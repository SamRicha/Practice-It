/*
 *  The following method attempts to return the median (middle) of three integer values, but it contains 
 *  logic errors. In what cases does the method return an incorrect result? How can the code be fixed? 
 *  Determine what is wrong with the code, and submit a corrected version that works properly.
 */

public static int medianOf3(int n1, int n2, int n3) {
    if (n1 <= n2 && n1 >= n3 || n1 >= n2 && n1 <= n3) {
        return n1;
    }else if(n2 <= n1 && n2 >= n3 || n2 >= n1 && n2 <= n3){
        return n2;
    }else if(n3 <= n1 && n3 >= n2 || n3 >= n1 && n1 <= n3){
        return n3;
    }
    return 0;
}
