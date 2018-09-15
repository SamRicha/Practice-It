/*
 *  The following program contains 6 errors. Correct the errors and submit a working version of the program. The corrected version of the program should produce the following output:
 *  
 *  Lines: 5
 *  Words: 21
 *  when it is run on the following input file, example.txt:
 *  
 *  hello  how    are you
 *  1 2 3 4
 *  
 *  I am fine
 *  This line has a large number of words on it
 */
 
public class Oops6 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("example.txt"));
        Scanner on = new Scanner(new File("example.txt"));
        countWords(in,on);
    }

    // Counts total lines and words in the input scanner.
    public static void countWords(Scanner input, Scanner on) {
        int lineCount = 0;
        int wordCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();   // read one line
            lineCount++;
        }
        while (on.hasNext()) {         // tokens in line
            String word = on.next();
            wordCount++;
        }        
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
    }
}
