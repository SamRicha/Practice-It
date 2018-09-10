/*
 *  Write a method named isNonVowel that returns whether a String is a non-vowel (anything but a 
 *  single-letter string containing a, e, i, o, or u, case-insensitively).
 */

public boolean isNonVowel(String text){
    boolean nonVowel = true; 
    char numChar = 'x';
    for(int i = 0; i < text.length(); i++){
        numChar = text.charAt(i);
        if(Character.toLowerCase(numChar) == 'a'){
            nonVowel = false;
            break;
        }else if(Character.toLowerCase(numChar) == 'e'){
            nonVowel = false;
            break;
        }else if(Character.toLowerCase(numChar) == 'i'){
            nonVowel = false;
            break;
        }else if(Character.toLowerCase(numChar) == 'o'){
            nonVowel = false;
            break;
        }else if(Character.toLowerCase(numChar) == 'u'){
            nonVowel = false;
            break;
        }
    }
    if(text.length() > 1){
        nonVowel = true;
    }
    return nonVowel;
}
