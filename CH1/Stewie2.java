/*
* Write a complete Java program in a class named Stewie2 that prints the following output. 
* Use at least one static method besides main to remove redundancy.
*/

/*
* //////////////////////
* || Victory is mine! ||
* \\\\\\\\\\\\\\\\\\\\\\
* || Victory is mine! ||
* \\\\\\\\\\\\\\\\\\\\\\
* || Victory is mine! ||
* \\\\\\\\\\\\\\\\\\\\\\
* || Victory is mine! ||
* \\\\\\\\\\\\\\\\\\\\\\
* || Victory is mine! ||
* \\\\\\\\\\\\\\\\\\\\\\
*/

public class Stewie2{
    public static void phrase(){
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    public static void main(String[] args){
        System.out.println("//////////////////////");
        for(int i = 0; i <= 4; i++){
            phrase();
        }
    }
}
