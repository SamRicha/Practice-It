/*
 *  Write a method called scientific that accepts two real numbers as parameters for a base and an exponent 
 *  computes the base times 10 to the exponent, as seen in scientific notation. For example, the call of 
 *  scientific(6.23, 5.0) would return 623000.0 and the call of scientific(1.9, -2.0) would return 0.019.
 */

public double scientific(double num1, int num2){
    double result = 0.0;
    double numChanger = 10.0;
  
    if(num2 > 0){
        for(int i = 1; i < num2; i++){
            numChanger = numChanger * 10; 
        }    
    } else if(num2 < 0){
        for(int i = num2; i <= 0; i++){
            numChanger = numChanger * .1; 
        }
    } else if(num2 == 0){
        numChanger = 1.0;
    }
    result = num1 * numChanger;
    return result;
}
