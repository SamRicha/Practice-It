function isPangram(word){
    var letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, letterJ, letterK,
        letterL, letterM, letterN, letterO, letterP, letterQ, letterR, letterS, letterT, letterU, letterV,
        letterW, letterX, letterY, letterZ, pangram;
    var newWord = word.toLowerCase();
    letterA = letterB = letterC = letterD = letterE = letterF = letterG = letterH = letterI = letterJ = 
        letterK = letterL = letterM = letterN = letterO = letterP = letterQ = letterR = letterS = letterT =
        letterU = letterV = letterW = letterX = letterY = letterZ = pangram = false;
    for(var i = 0; i < word.length; i++){
        if(newWord.charAt(i) == 'a'){
            letterA = true;
        }else if(newWord.charAt(i) == 'b'){
            letterB = true;
        }else if(newWord.charAt(i) == 'c'){
            letterC = true;
        }else if(newWord.charAt(i) == 'd'){
            letterD = true;
        }else if(newWord.charAt(i) == 'e'){
            letterE = true;
        }else if(newWord.charAt(i) == 'f'){
            letterF = true;
        }else if(newWord.charAt(i) == 'g'){
            letterG = true;
        }else if(newWord.charAt(i) == 'h'){
            letterH = true;
        }else if(newWord.charAt(i) == 'i'){
            letterI = true;
        }else if(newWord.charAt(i) == 'j'){
            letterJ = true;
        }else if(newWord.charAt(i) == 'k'){
            letterK = true;
        }else if(newWord.charAt(i) == 'l'){
            letterL = true;
        }else if(newWord.charAt(i) == 'm'){
            letterM = true;
        }else if(newWord.charAt(i) == 'n'){
            letterN = true;
        }else if(newWord.charAt(i) == 'o'){
            letterO = true;
        }else if(newWord.charAt(i) == 'p'){
            letterP = true;
        }else if(newWord.charAt(i) == 'q'){
            letterQ = true;
        }else if(newWord.charAt(i) == 'r'){
            letterR = true;
        }else if(newWord.charAt(i) == 's'){
            letterS = true;
        }else if(newWord.charAt(i) == 't'){
            letterT = true;
        }else if(newWord.charAt(i) == 'u'){
            letterU = true;
        }else if(newWord.charAt(i) == 'v'){
            letterV = true;
        }else if(newWord.charAt(i) == 'w'){
            letterW = true;
        }else if(newWord.charAt(i) == 'x'){
            letterX = true;
        }else if(newWord.charAt(i) == 'y'){
            letterY = true;
        }else if(newWord.charAt(i) == 'z'){
            letterZ = true;
        }else{
            
        }
    }
    if(letterA == true && letterB == true && letterC == true && letterD == true && letterE == true &&
       letterF == true && letterG == true && letterH == true && letterI == true && letterJ == true &&
       letterK == true && letterL == true && letterM == true && letterN == true && letterO == true &&
       letterP == true && letterQ == true && letterR == true && letterS == true && letterT == true &&
       letterU == true && letterV == true && letterW == true && letterX == true && letterY == true &&
       letterZ == true){
        pangram = true;
    }else{
    
    }
    return pangram;
}
