/*
 *  Write a function named longestWord that accepts an array of Strings and returns the String that has the longest 
 *  length. If more than one String in the array has the longest length, you the function should return the String 
 *  that occurs last in the array. If the passed array is empty, the method should return an empty String.
 *  
 *  For example, if an array named pokemon stores the following Strings:
 *  
 *  ["Pikachu", "Entei", "Mew", "Suicune", "Lugia", "Arcanine"] 
 *  The call of longestWord(pokemon) should return Arcanine.
 */

function longestWord(stringList){
    var longestString = stringList[0];
    for(var i = 0; i < stringList.length; i++){
        if(stringList[i].length >= longestString.length){    
            longestString = stringList[i];
        }
    }
    return longestString;
}
