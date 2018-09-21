/*
 *  Write a method named printGrid that accepts two integer parameters rows and cols. The output is a comma-separated 
 *  grid of numbers where the first parameter (rows) represents the number of rows of the grid and the second parameter 
 *  (cols) represents the number of columns. The numbers count up from 1 to (rows x cols). The output are displayed in 
 *  column-major order, meaning that the numbers shown increase sequentially down each column and wrap to the top of 
 *  the next column to the right once the bottom of the current column is reached. Assume that rows and cols are greater than 0.
 */

public static void printGrid(int rows, int cols){
    int countNumber = 0;
    int printNumber = 1;
    int commaStopper = cols - 1;
    while(countNumber < rows){    
        for(int i = 0; i < cols; i++){
         
            if(i == commaStopper){
                System.out.print(printNumber);
            }
            else{
                System.out.print(printNumber + ", ");
            }
            printNumber = printNumber + rows;
        }
        System.out.println();
        countNumber = countNumber + 1;
        printNumber = countNumber;
        printNumber = printNumber + 1;
    }
}
