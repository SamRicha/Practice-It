/*
* Write a complete Java program in a class named EggStop that generates the following output. 
* Use static methods to show structure and eliminate redundancy in your solution.
*/

/*
*   ______
*  /      \
* /        \
* \        /
*  \______/
*
*   ______
*  /      \
* /        \
* \        /
*  \______/
* +--------+
*
*   ______
*  /      \
* /        \
* |  STOP  |
* \        /
*  \______/
* +--------+
*/

public class EggStop{
    public static void top(){
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    public static void bottom(){
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    public static void egg(){
        top();
        bottom();
    }
    public static void stop(){
        System.out.println("|  STOP  |");
    }
    public static void line(){
        System.out.println("+--------+");
    }
    public static void space(){
        System.out.println();
    }
    public static void main(String[] args){        
        egg();
        space();
        egg();
        line();
        space();
        top();
        stop();
        bottom();
        line();
    }
}
