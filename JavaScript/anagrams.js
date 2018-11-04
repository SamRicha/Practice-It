/*
 *  string is an anagram of the first. A string is an anagram of another string if both strings contain 
 *  the same characters (ignoring case and non-alphabetic characters).
 *  
 *  For example, the call of anagrams("A decimal point", "I'm a dot in place!") should return true since 
 *  both strings contain the same letters. However, the call anagrams("Decimal point", "I'm a dot in place!") 
 *  should return false because even though both strings contain the same letters, the second string has one 
 *  more "a" than the first string.
 */

function anagrams(word1, word2){
    var newWord1 = word1.toLowerCase();
    var newWord2 = word2.toLowerCase();
    
    var word1CharCount = amciiCounter(newWord1);
    var word2CharCount = amciiCounter(newWord2);
    if(word1CharCount == word2CharCount){
        return true;
    }
    return false;
}

function amciiCounter(word){
    var letters = /^[A-Za-z]+$/;
    var wordValue = 0;
    
    for(var i = 0; i < word.length; i++){
        if(word.charAt(i).match(letters)){
            wordValue += word.charCodeAt(i);
        }
    }
    return wordValue;
}
