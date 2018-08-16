/*
 *  Write a method called vertical that accepts a String as its parameter and prints each letter of 
 *  the string on separate lines. For example, a call of vertical("hey now") should produce the following output:
 */
 
/*
 *  h
 *  e
 *  y
 *  
 *  n
 *  o
 *  w
  */
  
  public static void vertical(String text){
    for(int i = 0; i < text.length(); i++){
        System.out.println(text.substring(i,i+1));
    }
}
