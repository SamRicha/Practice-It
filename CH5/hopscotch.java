/*
 *  Write a method named hopscotch that accepts an integer parameter for a number of "hops" and prints a 
 *  hopscotch board of that many hops. A "hop" is defined as the split into two numbers and then back 
 *  together again into one. For example, hopscotch(3); should print:
 *  
 *     1
 *  2     3
 *     4
 *  5     6
 *     7
 *  8     9
 *     10
 */

public static void hopscotch(int numOfHops){
    int hopPosition = 1;
    int rowPosition = 1;
    int oddCounter = 0;
    String oddSpace = "   ";
    String evenSpace = "     ";
    while(oddCounter <= numOfHops){
        if(rowPosition % 2== 0){
            System.out.println(hopPosition + evenSpace + (hopPosition + 1));
            hopPosition+= 2;
        }else{
            System.out.println(oddSpace + hopPosition);
            hopPosition++;
            oddCounter++;
        }
        rowPosition++;
    } 
}
