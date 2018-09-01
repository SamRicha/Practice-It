/*
 *  Modify your solution to the previous ProcessName exercise so that it re-prompts until the user types 
 *  a name that is at least 5 letters total in length and has at least one space in it. For example:
 *  
 *  Type your name: Joe
 *  Error, must be at least 5 chars with a space.
 *  Type your name: O K!
 *  Error, must be at least 5 chars with a space.
 *  Type your name: what
 *  Error, must be at least 5 chars with a space.
 *  Type your name: Tyler Durden
 *  Your name is: Durden, T.
 */
 
Scanner scan = new Scanner(System.in);   
String firstName = "";
String lastName = "";
String fullName = "";
String phrase = "";
int spaceIndicator = 0;
do{
    System.out.print("Type your name: ");
    phrase = scan.nextLine();
    if(phrase.contains(" ")){
        spaceIndicator = phrase.indexOf(" ");
    }
    if(phrase.contains(" ") && spaceIndicator != 0 && phrase.length() >= 5){
        firstName = phrase.substring(0,spaceIndicator);
        lastName = phrase.substring(spaceIndicator + 1);
        System.out.println("Your name is: " + lastName + ", " + firstName.substring(0,1) + ".");
    }else{
        System.out.println("Error, must be at least 5 chars with a space.");
    }
}while(spaceIndicator == 0 || phrase.length() < 5 || phrase.contains(" ") == false);
