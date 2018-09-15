/*
 *  Write a method named printEntireFile that prompts the user for a file name and prints the contents of that 
 *  file to the console as output. You may assume that the file exists. For example, if the file example.txt 
 *  contains the following input data:
 *  
 *  hello  how    are you
 *  1 2 3 4
 *  
 *  I am fine
 *  Then the following would be an example dialogue of your method:
 *  
 *  Type a file name: example.txt
 *  hello  how    are you
 *  1 2 3 4
 *  
 *  I am fine
 */

public static void printEntireFile() throws FileNotFoundException{
    Scanner scan = new Scanner(System.in);
    System.out.print("Type a file name: ");
    String text = scan.next();
    Scanner scoon = new Scanner(new File(text));
    while(scoon.hasNextLine()){
        String line = scoon.nextLine();
        System.out.println(line);
    }
}
