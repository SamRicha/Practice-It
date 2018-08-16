/*
 *  Write a function named printRockets which prints the following output to the console. Use helper 
 *   functions to show structure and eliminate redundancy in your solution.
 *  
 *  Note that there are two rocket ships next to each other. What redundancy 
 *  can you eliminate using static methods? What redundancy cannot be eliminated?
 *  
 *     /\       /\
 *    /  \     /  \
 *   /    \   /    \
 *  +------+ +------+
 *  |      | |      |
 *  +------+ +------+
 *  |Rocket| |Rocket|
 *  |  #1  | |  #2  |
 *  +------+ +------+
 *  |      | |      |
 *  +------+ +------+
 *     /\       /\
 *    /  \     /  \
 *   /    \   /    \
 */

function printRockets(){
    tip();
    body();
    tip();
}
function tip(){
    console.log("   /\\       /\\");
    console.log("  /  \\     /  \\");
    console.log(" /    \\   /    \\");
}
function body(){
    console.log("+------+ +------+\n|      | |      |\n+------+ +------+");
    console.log("|Rocket| |Rocket|\n|  #1  | |  #2  |\n+------+ +------+");
    console.log("|      | |      |\n+------+ +------+");
}
