/*
* Write a complete Java program in a class named FightSong that generates the following three figures of output. 
* Use static methods to show structure and eliminate redundancy in your solution.
*
* In particular, make sure that main contains no System.out.println statements, that any System.out.println statement(s)
* repeated are captured in a method that is called just once, and that the same System.out.println statement never appears
* in two places in the code.
*/

/*
* Go, team, go!
* You can do it.
*
* Go, team, go!
* You can do it.
* You're the best,
* In the West.
* Go, team, go!
* You can do it.
*
* Go, team, go!
* You can do it.
* You're the best,
* In the West.
* Go, team, go!
* You can do it.
*
* Go, team, go!
* You can do it.
*/

public class FightSong{
    public static void goPhrase(){
        System.out.println("Go, team, go!");
    }
    public static void doPhrase(){
        System.out.println("You can do it.");
    }
    public static void westPhrase(){
        System.out.println("You're the best,\nIn the West.");
    }
    public static void goDoPhrase(){
        goPhrase();
        doPhrase();
    }    
    public static void bigPhrase(){
        goDoPhrase();
        westPhrase();
        goDoPhrase();
    }
    public static void main(String[] args){
        goDoPhrase();
        System.out.println();
        bigPhrase();
        System.out.println();
        bigPhrase();
        System.out.println();
        goDoPhrase();
    }
}
