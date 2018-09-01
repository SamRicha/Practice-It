/*
 *  Exercise 3.8 asked you to write a method called quadratic that solves quadratic equations and prints their roots. 
 *  Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0. 
 *  The formula for solving a quadratic equation is:
 *  
 *  equation	x2 - 7x + 12	x2 + 3x + 2
 *  call	quadratic(1, -7, 12);	quadratic(1, 3, 2);
 *  output	
 *  First root = 4.0
 *  Second root = 3.0
 *  First root = -1.0
 *  Second root = -2.0
 *  But for some values of a, b, and c, the formula does not find any valid roots. Under what conditions would this formula fail? Modify the quadratic method so that it will reject invalid values of a, b, or c by throwing an IllegalArgumentException. (You may want to go back and complete the exercise in the previous chapter first.)
 */

public void quadratic(int a, int b, int c){

        double constantNumber = (Math.sqrt(Math.pow(b, 2) - 4*a*c));
        double result1 = ((-b)+ constantNumber)/ (2*a);
        double result2 = ((-b)- constantNumber)/ (2*a);
    if(Double.isNaN(result1) == true || result1 == Double.POSITIVE_INFINITY || result1 == 
       Double.NEGATIVE_INFINITY || Double.isNaN(result2) == true || result2 == Double.POSITIVE_INFINITY ||
       result2 == Double.NEGATIVE_INFINITY ){
        throw new IllegalArgumentException();
    }else{
        System.out.println("First root = " + result1);
        System.out.println("Second root = " + result2);
    }
}
