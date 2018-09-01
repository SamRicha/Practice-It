/*
 *  Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter and 
 *  returns the number of days in that month in this year. For example, the call daysInMonth(9) would return 
 *  30 because September has 30 days. Assume that the code is not being run during a leap year (that February always has 28 days).
 *  
 *  Month	1 Jan	2 Feb	3 Mar	4 Apr	5 May	6 Jun	7 Jul	8 Aug	9 Sep	10 Oct	11 Nov	12 Dec
 *  Days	31	28	31	30	31	30	31	31	30	31	30	31
 */

public int daysInMonth(int monthNum){
    if(monthNum == 1){
        return 31;
    }else if(monthNum == 2){
        return 28;
    }else if(monthNum == 3){
        return 31;
    }else if(monthNum == 4){
        return 30;
    }else if(monthNum == 5){
        return 31;
    }else if(monthNum == 6){
        return 30;
    }else if(monthNum == 7){
        return 31;
    }else if(monthNum == 8){
        return 31;
    }else if(monthNum == 9){
        return 30;
    }else if(monthNum == 10){
        return 31;
    }else if(monthNum == 11){
        return 30;
    }else if(monthNum == 12){
        return 31;
    }
    return 0;
}
