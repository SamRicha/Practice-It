/*
 *  Use for loops to produce the following console output:
 *  
 *  10,
 *  9,
 *  8,
 *  7,
 *  6,
 *  5,
 *  4,
 *  3,
 *  2,
 *  1,
 *  Blast off!
 */

var count = 10;
for(var i = 1; i <= 10; i++){
    console.log(count + ",");
    count--;
}
console.log("Blast off!");
