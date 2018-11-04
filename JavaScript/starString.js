/*
 *  Write a recursive function named starString that accepts an integer parameter n and returns a string of 
 *  stars (asterisks) 2n long (i.e., 2 to the nth power). For example:
 *  
 *  Call	Output	Reason
 *  starString(0);	"*"	20 = 1
 *  starString(1);	"**"	21 = 2
 *  starString(2);	"****"	22 = 4
 *  starString(3);	"********"	23 = 8
 *  starString(4);	"****************"	24 = 16
 */

function starString(number){
    if(number < 0){
        throw("exponent should be non-negative");
    }else if(number == 0){
        return "*";
    }else{
        return starString(number - 1) + starString(number - 1);
    }
}
