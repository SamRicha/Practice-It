/*
 *  Write a method named pay that accepts a real number for a TA's salary and an integer for the number of 
 *  hours the TA worked this week, and returns how much money to pay the TA. For example, 
 *  the call pay(5.50, 6) should return 33.0.
 *  
 *  The TA should receive "overtime" pay of 1 ½ normal salary for any hours above 8. For example, 
 *  the call pay(4.00, 11) should return (4.00 * 8) + (6.00 * 3) or 50.0.
 */
 
 public double pay(double perHour, int hourAmount){
    double result;
        
    if(hourAmount > 8){
        result = (perHour * 8) + ((perHour * 1.50) * (hourAmount - 8));
    }else{
        result = perHour * hourAmount;
    }
     
    return result;
}
