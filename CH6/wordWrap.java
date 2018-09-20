/*
 *  Write a method called wordWrap that accepts a Scanner representing an input file as its parameter and outputs 
 *  each line of the file to the console, word-wrapping all lines that are longer than 60 characters. For example, 
 *  if a line contains 112 characters, the method should replace it with two lines: one containing the first 60 
 *  characters and another containing the final 52 characters. A line containing 217 characters should be wrapped 
 *  into four lines: three of length 60 and a final line of length 37.
 */

public static void wordWrap(Scanner scan) throws FileNotFoundException{
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        int length = line.length();
        int start = 0;
        int end = 60;
        while(length > 60){
            System.out.println(line.substring(start,end));
            start+= 60;
            end+= 60;
            length-= 60;
        }
        System.out.println(line.substring(start,line.length()));
    }
}
