/*
* Write a Java program called DollarFigure that produces the following output. Use nested for loops to capture 
* the structure of the figure.
*/

/*
* $$$$$$$**************$$$$$$$
* **$$$$$$************$$$$$$**
* ****$$$$$**********$$$$$****
* ******$$$$********$$$$******
* ********$$$******$$$********
* **********$$****$$**********
* ************$**$************
*/

public class DollarFigure{
    public static void main(String [] args){
        int dollarSign = 7;
        int outerStar = 0;
        int innerStar = 14;
        
        for(int i = 0; i <= 6; i++){
            for(int j = 1; j <= outerStar; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= dollarSign; k++){
                System.out.print("$");
            }
            for(int k = 1; k <= innerStar; k++){
                System.out.print("*");
            }
            for(int k = 1; k <= dollarSign; k++){
                System.out.print("$");
            }
            for(int k = 1; k <= outerStar; k++){
                System.out.print("*");
            }
            System.out.println();
            dollarSign-=1;
            outerStar+=2;
            innerStar-=2;
        }
    }
}
