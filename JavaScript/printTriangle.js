/*
 *  Write a function named printTriangle that uses a for loop to produce the following console output:
 *  
 *  #
 *  ##
 *  ###
 *  ####
 *  #####
 *  ######
 */
 
function printTriangle(){
    for(var i = 1; i <= 6; i++){
        var hashLine = "";
        for(var j = 1; j <= i; j++){
            hashLine += "#";
        }
        console.log(hashLine);
    }
}
