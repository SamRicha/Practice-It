/*
 *  Write a method named inputStats that takes a Scanner representing a file as a parameter and that reports various statistics about the file's text. In particular, your method should report the number of lines in the file, the longest line, the number of tokens on each line, and the length of the longest token on each line. You may assume that the input file has at least one line of input and that each line has at least one token. For example, if a Scanner named input on file carroll.txt contains the following text:
 *  
 *  "Beware the Jabberwock, my son,
 *  the jaws that bite, the claws that catch,
 *  Beware the JubJub bird and shun
 *  the frumious bandersnatch."
 *  then the call inputStats(input); should produce the following output:
 *  
 *  Line 1 has 5 tokens (longest = 11)
 *  Line 2 has 8 tokens (longest = 6)
 *  Line 3 has 6 tokens (longest = 6)
 *  Line 4 has 3 tokens (longest = 14)
 *  Longest line: the jaws that bite, the claws that catch,
 */

public static void inputStats(Scanner scan){
    int tokenCounter = 1;
    int lineCounter = 0;
    int longestTokenNum = 0;
    String longestLine = "";
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        if(line.length() > longestLine.length()){
            longestLine = line;
        }
        Scanner scanDeep = new Scanner(line);
        while(scanDeep.hasNext()){
            String word = scanDeep.next();
            tokenCounter++;
            if(word.length() > longestTokenNum){
                longestTokenNum = word.length();
            }
        }
        lineCounter++;
        if(lineCounter == 1){
            tokenCounter--;
        }
        System.out.println("Line " + lineCounter + " has " + tokenCounter +
                           " tokens (longest = " + longestTokenNum + ")");
        longestTokenNum = 0;
        tokenCounter = 0;
    }
    System.out.println("Longest line: " + longestLine);
}
