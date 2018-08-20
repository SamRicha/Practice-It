/*
 *  Write a function named stutter which takes a string and uses a for loop to 
 *  return a new string replacing each letter of the parameter with consecutive 
 *  duplicates of the same letter. For example, A call of stutter("Pikachu") would return "PPiikkaacchhuu".
 */

function stutter(text){
    var stutterPhrase = "";
    for(var i = 0; i < text.length; i++){
            stutterPhrase += text.substr(i,1);
            stutterPhrase += text.substr(i,1);
    }
    return stutterPhrase;
}
