/*
 *  Write a method named isVowel that returns whether a String is a vowel (a single-letter string containing 
 *  a, e, i, o, or u, case-insensitively).
 */

public boolean isVowel(String letter){
    if(letter.toLowerCase().equals("a")){
        return true;
    }else if(letter.toLowerCase().equals("e")){
        return true;
    }else if(letter.toLowerCase().equals("i")){
        return true;
    }else if(letter.toLowerCase().equals("o")){
        return true;
    }else if(letter.toLowerCase().equals("u")){
        return true;
    }else{
        return false;
    }
}
