// Write a program in a class named StarFigure that produces the following output using for loops.

/*
* ////////////////\\\\\\\\\\\\\\\\
* ////////////********\\\\\\\\\\\\
* ////////****************\\\\\\\\
* ////************************\\\\
* ********************************
*/

public class StarFigure{
    public static void main(String [] args){
        int slash = 15;
        int star = 0;
        for(int i = 0; i <= 4; i++){
            for(int k = 0; k <= slash; k++){
                System.out.print("/");
            }
            for(int g = 1; g <= star; g++){
                System.out.print("*");
            }
            for(int j = 0; j <= slash; j++){
                System.out.print("\\");
            }
            slash -= 4;
            star += 8;
            System.out.println();
        }
    }
}
