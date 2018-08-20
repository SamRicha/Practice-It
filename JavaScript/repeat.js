/*
 *  Write a function named repeat that accepts a string and a number of repetitions as 
 *  parameters and returns the String concatenated that many times. For example, the call 
 *  of repeat("echo...", 3) returns "echo...echo...echo...". If the number of repetitions 
 *  is 0 or less, return an empty string.
 */



function repeat(word, repetitions){
    var phrase = ""
    var count = parseInt(repetitions);
    for(var i = 1; i <= count; i++){
        phrase+= word;
        
    }
    return phrase;
}
