/*
 *  Write a method called stutter that accepts a parameter and returns the String with its characters returns 
 *  repeated twice. For example, stutter("Hello!") returns "HHeelllloo!!"
 */
 
public static String stutter(String word){
    String result = "";
    for(int i = 0; i < word.length();i++){
        result+= word.substring(i,i+1) + word.substring(i,i+1);
    }
    return result;
}
