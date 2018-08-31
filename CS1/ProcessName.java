/*
 *  Add to the code below so that it reads the user's first and last name (an entire line as a single string), 
 *  then prints the last name followed by a comma and the first initial. (You may assume that the user types 
 *  valid input consisting of a first name, a single space, then a last name.) For example:
 *  
 *  Type your name: Jessica Miller
 *  Your name is: Miller, J.
 */
 
Scanner scan = new Scanner(System.in);   
System.out.print("Type your name: ");
String firstName = scan.next();
String lastName = scan.next();
firstName = firstName.substring(0,1);

System.out.print("Your name is: " + lastName + ", " + firstName + ".");
