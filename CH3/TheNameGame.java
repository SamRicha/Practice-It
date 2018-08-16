/*
 *  Write a complete program called "TheNameGame," where the user inputs a first and last name 
 *  and a song in the following format is printed about their first, then 
 *  last, name. Use a method to avoid redundancy.
 */

/*
 *  What is your name? Fifty Cent
 *  Fifty Fifty, bo-Bifty
 *  Banana-fana fo-Fifty
 *  Fee-fi-mo-Mifty
 *  FIFTY!
 *  Cent Cent, bo-Bent
 *  Banana-fana fo-Fent
 *  Fee-fi-mo-Ment
 *  CENT! 
 */

import java.util.Scanner;

public class TheNameGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        
        String first = scan.next();
        String last = scan.next();
 
        repeatSong(first, last);
    }
    public static void song(String name){
        String lineOneRepeat="Banana-fana fo-F";
        String lineThreeRepeat = "Fee-fi-mo-M";
        String endOfFirst = name.substring(1);
        
        System.out.println(name + " " + name + ", bo-B" + endOfFirst);
        System.out.println(lineOneRepeat + endOfFirst);
        System.out.println(lineThreeRepeat + endOfFirst);
        System.out.println(name.toUpperCase() + "!");
    }
    public static void repeatSong(String first, String last){
        song(first);
        song(last);
    }
}
