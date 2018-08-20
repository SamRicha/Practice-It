/*
 *  Use for loops to produce the following output:
 *  
 *  1
 *  22
 *  333
 *  4444
 *  55555
 *  666666
 *  7777777
 */

for(var i = 1; i <= 7; i++){
  var numberLine = "";
  for(var j = 1; j <= i; j++){
      numberLine += i;
  }
  console.log(numberLine);
}
