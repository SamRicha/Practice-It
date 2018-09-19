/*
 *  Write a method named readEntireFile that accepts a Scanner representing an input file as its parameter, 
 *  then reads that file and returns the entire text contents of that file as a String.
 */

public static String readEntireFile(Scanner scan) throws FileNotFoundException{
    String line = "";
    String masterString = "";
    while(scan.hasNextLine()){
        line = scan.nextLine();
        masterString += line + "\n";
    }
    return masterString;
}
