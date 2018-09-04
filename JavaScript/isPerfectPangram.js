/*
 *  Write a function named isPerfectPangram that accepts a string and returns true if the string is a perfect 
 *  pangram. As covered in the previous problem, isPangram, a pangram is any phrase that contains at least one 
 *  of each of the 26 letters in the English alphabet (ignoring letter-casing).
 *  
 *  A pangram is considered "perfect" if and only if it contains a single occurrence of each letter in the 
 *  alphabet (non-alphabetic characters are ignored). For example, a call to isPangram("Mr. Jock, TV quiz PhD, 
 *  bags few lynx.") should return true since it contains exactly one occurance of each 26 letters in the alphabet. 
 *  However, a call of isPangram("The quick brown fox jumps over a lazy dog.") should return false since some letters 
 *  occur more than once (e.g., "a" and "o").
 */

function isPerfectPangram(word){
    var letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK,
        letterL, letterM, letterN, letterO, letterP, letterQ, letterR, letterS, letterT, letterU, letterV,
        letterW, letterX, letterY, letterZ;
    var newWord = word.toLowerCase();
        
    letterA = letterB = letterC = letterD = letterE = letterF = letterG = letterH = letterI = letterJ = 
        letterK = letterL = letterM = letterN = letterO = letterP = letterQ = letterR = letterS = letterT =
        letterU = letterV = letterW = letterX = letterY = letterZ = 0;
    
    var pangram = false;
    for(var i = 0; i < word.length; i++){
        if(newWord.charAt(i) == 'a'){
            letterA++;
        }else if(newWord.charAt(i) == 'b'){
            letterB++;
        }else if(newWord.charAt(i) == 'c'){
            letterC++;
        }else if(newWord.charAt(i) == 'd'){
            letterD++;
        }else if(newWord.charAt(i) == 'e'){
            letterE++;
        }else if(newWord.charAt(i) == 'f'){
            letterF++;
        }else if(newWord.charAt(i) == 'g'){
            letterG++;
        }else if(newWord.charAt(i) == 'h'){
            letterH++;
        }else if(newWord.charAt(i) == 'i'){
            letterI++;
        }else if(newWord.charAt(i) == 'j'){
            letterJ++;
        }else if(newWord.charAt(i) == 'k'){
            letterK++;
        }else if(newWord.charAt(i) == 'l'){
            letterL++;
        }else if(newWord.charAt(i) == 'm'){
            letterM++;
        }else if(newWord.charAt(i) == 'n'){
            letterN++;
        }else if(newWord.charAt(i) == 'o'){
            letterO++;
        }else if(newWord.charAt(i) == 'p'){
            letterP++;
        }else if(newWord.charAt(i) == 'q'){
            letterQ++;
        }else if(newWord.charAt(i) == 'r'){
            letterR++;
        }else if(newWord.charAt(i) == 's'){
            letterS++;
        }else if(newWord.charAt(i) == 't'){
            letterT++;
        }else if(newWord.charAt(i) == 'u'){
            letterU++;
        }else if(newWord.charAt(i) == 'v'){
            letterV++;
        }else if(newWord.charAt(i) == 'w'){
            letterW++;
        }else if(newWord.charAt(i) == 'x'){
            letterX ++;
        }else if(newWord.charAt(i) == 'y'){
            letterY++;
        }else if(newWord.charAt(i) == 'z'){
            letterZ++;
        }else{
            
        }
    }
    if(letterA == 1 && letterB == 1 && letterC == 1 && letterD == 1 && letterE == 1 &&
       letterF == 1 && letterG == 1 && letterH == 1 && letterI == 1 && letterJ == 1 &&
       letterK == 1 && letterL == 1 && letterM == 1 && letterN == 1 && letterO == 1 &&
       letterP == 1 && letterQ == 1 && letterR == 1 && letterS == 1 && letterT == 1 &&
       letterU == 1 && letterV == 1 && letterW == 1 && letterX == 1 && letterY == 1 &&
       letterZ == 1){
        pangram = true;
    }else{
    
    }
    return pangram;
}
