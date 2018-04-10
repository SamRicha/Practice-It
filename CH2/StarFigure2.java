/*
* Modify your StarFigure code from the previous problem to use a constant for the size. The outputs below 
* use a constant size of 3 (left) and 6 (right):
*/

/*
*      Size 3
* ////////\\\\\\\\
* ////********\\\\
* ****************
*/

/*
*                  Size 6
* ////////////////////\\\\\\\\\\\\\\\\\\\\
* ////////////////********\\\\\\\\\\\\\\\\
* ////////////****************\\\\\\\\\\\\
* ////////************************\\\\\\\\
* ////********************************\\\\
* ****************************************
*/

public class StarFigure2{
    public static final int SIZE = 3;
    public static void main(String [] args){
        
        int star = 0;
        int slash = SIZE * 4 - 1;                                    
        slash -= 4;                                    
        for(int i = 1; i <= SIZE; i++){
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
