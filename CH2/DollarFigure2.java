/*
* Modify your DollarFigure program from the previous exercise to become a new program called 
* DollarFigure2 that uses a global constant for the figure's height. (You may want to make loop 
* tables first.) The previous output used a constant height of 7. The outputs below use a constant 
* size of 3 (left) and 5 (right):
*/

/*    
*    Size 3
* $$$******$$$
* **$$****$$**
* ****$**$****
*/

/*
*        Size 5
* $$$$$**********$$$$$
* **$$$$********$$$$**
* ****$$$******$$$****
* ******$$****$$******
* ********$**$********
*/

public class DollarFigure2{
    public static final int SIZE = 3;
    public static void main(String [] args){
        int dollarSign = SIZE;
        int outerStar = 0;
        int innerStar = SIZE * 2;
        
        for(int i = 1; i <= SIZE; i++){
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
