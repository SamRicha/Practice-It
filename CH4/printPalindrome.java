/*
 *  Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts 
 *  the user to enter one or more words and prints whether the entered String is a palindrome (i.e., reads the 
 *  same forwards as it does backwards, like "abba" or "racecar"). If the following Scanner object were declared:
 *  
 *  Scanner console = new Scanner(System.in);
 *  printPalindrome(console);
 *  The resulting output for a call where the user types a palindrome would be:
 *  
 *  Type one or more words: racecar
 *  racecar is a palindrome!
 *  The output for a call where the user types a word that is not a palindrome would be:
 *  
 *  Type one or more words: hello
 *  hello is not a palindrome.
 *  For an added challenge, make the code case-insensitive, so that words like "Abba" and "Madam" will be considered palindromes.
 */

public static void printPalindrome(Scanner scan){
    System.out.print("Type one or more words: ");
    String word1 = scan.nextLine();
    String word2 = "";
    for(int i = 0; i < word1.length(); i++){
        word2 = word1.charAt(i) + word2;
    }
    if(word1.toLowerCase().equals(word2.toLowerCase())){
        System.out.println(word1 + " is a palindrome!");
    }else{
        System.out.println(word1 + " is not a palindrome.");
    }
}
