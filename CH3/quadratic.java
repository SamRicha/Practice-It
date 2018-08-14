/*
 *  Write a method called quadratic that solves quadratic equations and prints their roots. 
 *  Recall that a quadratic equation is a polynomial equation in terms of a variable x of the 
 *  form a x2 + b x + c = 0.
 */

/*
 *  Here are some example equations and their roots:
 *  equation	x2 - 7x + 12	x2 + 3x + 2
 *    
 *  call	  quadratic(1, -7, 12);	  quadratic(1, 3, 2);
 *  output:	
 *          First root = 4.0        First root = -1.0
 *          Second root = 3.0       Second root = -2.0     
 */

public void quadratic(int a, int b, int c){
    double constantNumber = (Math.sqrt(Math.pow(b, 2) - 4*a*c));
    double result1 = ((-b)+ constantNumber)/ (2*a);
    double result2 = ((-b)- constantNumber)/ (2*a);
    System.out.println("First root = " + result1);
    System.out.println("Second root = " + result2);
}
