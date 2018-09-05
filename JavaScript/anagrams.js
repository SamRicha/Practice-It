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
    var letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK,
        letterL, letterM, letterN, letterO, letterP, letterQ, letterR, letterS, letterT, letterU, letterV,
        letterW, letterX, letterY, letterZ, letterA1, letterB1, letterC1, letterD1, letterE1, letterF1, 
        letterG1, letterH1, letterI1, letterJ1, letterK1, letterL1, letterM1, letterN1, letterO1, letterP1,
        letterQ1, letterR1, letterS1, letterT1, letterU1, letterV1, letterW1, letterX1, letterY1, letterZ1;
    var newWord = word1.toLowerCase();
    var newWord1 = word2.toLowerCase();

    letterA = letterB = letterC = letterD = letterE = letterF = letterG = letterH = letterI = letterJ = 
        letterK = letterL = letterM = letterN = letterO = letterP = letterQ = letterR = letterS = letterT =
        letterU = letterV = letterW = letterX = letterY = letterZ = letterA1 = letterB1 = letterC1 = 
        letterD1 = letterE1 = letterF1 = letterG1 = letterH1 = letterI1 = letterJ1 = letterK1 = letterL1 =
        letterM1 = letterN1 = letterO1 = letterP1 = letterQ1 = letterR1 = letterS1 = letterT1 = letterU1 =
        letterV1 = letterW1 = letterX1 = letterY1 = letterZ1 = 0;
    
    var angram = false;
    for(var i = 0; i < word1.length; i++){
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
    for(var i = 0; i < word2.length; i++){
        if(newWord1.charAt(i) == 'a'){
            letterA1++;
        }else if(newWord1.charAt(i) == 'b'){
            letterB1++;
        }else if(newWord1.charAt(i) == 'c'){
            letterC1++;
        }else if(newWord1.charAt(i) == 'd'){
            letterD1++;
        }else if(newWord1.charAt(i) == 'e'){
            letterE1++;
        }else if(newWord1.charAt(i) == 'f'){
            letterF1++;
        }else if(newWord1.charAt(i) == 'g'){
            letterG1++;
        }else if(newWord1.charAt(i) == 'h'){
            letterH1++;
        }else if(newWord1.charAt(i) == 'i'){
            letterI1++;
        }else if(newWord1.charAt(i) == 'j'){
            letterJ1++;
        }else if(newWord1.charAt(i) == 'k'){
            letterK1++;
        }else if(newWord1.charAt(i) == 'l'){
            letterL1++;
        }else if(newWord1.charAt(i) == 'm'){
            letterM1++;
        }else if(newWord1.charAt(i) == 'n'){
            letterN1++;
        }else if(newWord1.charAt(i) == 'o'){
            letterO1++;
        }else if(newWord1.charAt(i) == 'p'){
            letterP1++;
        }else if(newWord1.charAt(i) == 'q'){
            letterQ1++;
        }else if(newWord1.charAt(i) == 'r'){
            letterR1++;
        }else if(newWord1.charAt(i) == 's'){
            letterS1++;
        }else if(newWord1.charAt(i) == 't'){
            letterT1++;
        }else if(newWord1.charAt(i) == 'u'){
            letterU1++;
        }else if(newWord1.charAt(i) == 'v'){
            letterV1++;
        }else if(newWord1.charAt(i) == 'w'){
            letterW1++;
        }else if(newWord1.charAt(i) == 'x'){
            letterX1++;
        }else if(newWord1.charAt(i) == 'y'){
            letterY1++;
        }else if(newWord1.charAt(i) == 'z'){
            letterZ1++;
        }else{
            
        }
    }
    if(letterA == letterA1 && letterB == letterB1 && letterC == letterC1 && letterD == letterD1 &&
       letterE == letterE1 && letterF == letterF1 && letterG == letterG1 && letterH == letterH1 && 
       letterI == letterI1 && letterJ == letterJ1 && letterK == letterK1 && letterL == letterL1 && 
       letterM == letterM1 && letterN == letterN1 && letterO == letterO1 && letterP == letterP1 &&
       letterQ == letterQ1 && letterR == letterR1 && letterS == letterS1 && letterT == letterT1 &&
       letterU == letterU1 && letterV == letterV1 && letterW == letterW1 && letterX == letterX1 && 
       letterY == letterY1 && letterZ == letterZ1){
        angram = true;
    }else{
    
    }
    return angram;
}
