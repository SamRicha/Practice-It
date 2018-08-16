/*
 *  Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. 
 *  For example, a call of printReverse("hello there!"); should print the following output:
 *  
 *  !ereht olleh
 *
 *  If the empty string is passed, no output is produced. Your method should produce a complete line of output.
 */
 
 public static void printReverse(String text){
    for(int i = 0; i < text.length(); i++){
        System.out.print(text.substring(text.length()-i-1,text.length()-i));
    }
}
