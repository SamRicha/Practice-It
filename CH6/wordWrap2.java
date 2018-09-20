/*
 *  Modify the preceding wordWrap method into a new wordWrap2 method that accepts a second parameter for a PrintStream to 
 *  write the data, and outputs the newly wrapped text to that PrintStream rather than to the console. Also, modify it to 
 *  use a local variable to store the maximum line length rather than hard-coding 60. (You can go back to the last problem 
 *  to copy your solution code from there and paste it here as a starting point.)
 */

public static void wordWrap2(Scanner scan, PrintStream output) throws FileNotFoundException{
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        int length = line.length();
        int start = 0;
        int end = 60;
        while(length > 60){
            output.println(line.substring(start,end));
            start+= 60;
            end+= 60;
            length-= 60;
        }
        output.println(line.substring(start,line.length()));
    }
}
