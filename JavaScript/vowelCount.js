/*
 *  Write a function named vowelCount that accepts a string and returns the number of vowels (a, e, i, o, or u) that the 
 *  string contains.
 *
 *  For example, the call of vowelCount("kookaburra") should return 5 (two o's, 2 a's, and one u). When passed a string 
 *  without any vowels (such as an empty string, "01234", or "sky"), 0 should be returned.
 */
 
function vowelCount(word){
    var vowel = 0;
    var underCaseWord = word.toLowerCase();
    for(var i = 1; i <= word.length; i++){
        if(underCaseWord.substr(i,1) == "a" || underCaseWord.substr(i,1) == "e" ||
            underCaseWord.substr(i,1) == "i" || underCaseWord.substr(i,1) == "o" ||
            underCaseWord.substr(i,1) == "u"){
            vowel++;
        }else{
        }
    }
    return vowel;
}
