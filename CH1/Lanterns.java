/*
* Write a complete Java program in a class named Lanterns that generates the following three figures of output. 
* Use static methods to show structure and eliminate redundancy in your solution.
*
* In particular, make sure that main contains no System.out.println statements except for blank lines, that any 
* System.out.println statement(s) repeated are captured in a method that is called just once, and that the same 
* System.out.println statement never appears in two places in the code.
*/

/*
*     *****
*   *********
* *************
*
*     *****
*   *********
* *************
* * | | | | | *
* *************
*     *****
*   *********
* *************
*
*     *****
*   *********
* *************
*     *****
* * | | | | | *
* * | | | | | *
*     *****
*     *****
*/

public class Lanterns{
    public static void pyramidTop(){
        System.out.println("    *****");
    }
    public static void pyramidFull(){
        pyramidTop();
        System.out.println("  *********");
        pyramidBottom();
    }
    public static void pyramidBottom(){
        System.out.println("*************");
    }
    public static void light(){
        System.out.println("* | | | | | *");
    }
    public static void main(String[] args){
        pyramidFull();
        System.out.println();
        pyramidFull();
        light();
        pyramidBottom();
        pyramidFull();
        System.out.println();
        pyramidFull();
        pyramidTop();
        light();
        light();
        pyramidTop();
        pyramidTop();
    }
}
