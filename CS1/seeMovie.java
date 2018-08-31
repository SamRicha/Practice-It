/*
 *  You're thinking about going with your friends to a movie. Write a Java method seeMovie that accepts two parameters: 
 *  the cost of a ticket in dollars, and the number of stars the movie received out of 5. The method should print console 
 *  output about how interested you are; print either very interested, sort-of interested, or not interested, based on the 
 *  following criteria:
 *  
 *  You like bargains. Any movie that costs less than $5.00 is one that you want to see very much.
 *  You dislike expensive movies. You are not interested in seeing any movie that costs $12.00 or more, unless it got 
 *  5 stars (and even then, you are only sort-of interested).
 *  You like quality. You are very interested in seeing 5 star movies that cost under $12.00.
 *  You are sort-of interested in seeing movies costing between $5.00 - $11.99 that also got between 2-4 stars inclusive.
 *  You are not interested in seeing any other movies not described previously.
 */
 
public static void seeMovie(double ticketCost, int starAmount){
    if(ticketCost < 5.00 || ticketCost < 12.00 && starAmount == 5){
        System.out.println("very interested");
    }else if(ticketCost >= 12.00 && starAmount == 5 || ticketCost >= 5.00 && ticketCost < 12.00 &&
            starAmount >= 2 && starAmount <= 4){
        System.out.println("sort-of interested");
    }else{
        System.out.println("not interested");
    }
}
