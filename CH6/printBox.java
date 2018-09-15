/*
 *  Write a method named printBox that accepts two parameters: a Scanner representing an input file, and an 
 *  integer representing the length of the longest line of input in that file. Your method should print the contents 
 *  of the file to the console, but print them inside a box figure. For example, if the file example.txt contains the 
 *  following input data:
 *  
 *  This is some
 *  text here.
 *  Then the following would be the output of your method, when passed a Scanner on that file and the integer 12 as parameters:
 *  
 *  +--------------+
 *  | This is some |
 *  | text here.   |
 *  +--------------+
 */

public static void printBox(Scanner file, int num) throws FileNotFoundException{
    String width = "";
    System.out.print("+");
    for(int i = 0; i <= num+1; i++){
        width+="-";
    }
    System.out.print(width);
    System.out.println("+");
    while(file.hasNextLine()){
        System.out.print("| ");
        String line = file.nextLine();
        System.out.print(line);
        while(line.length() <= num){
            System.out.print(" ");
            line+=" ";
        }
        System.out.println("|");
    }
    System.out.print("+");
    System.out.print(width);
    System.out.println("+");
}
