/*
 *  Write a method called swapPairs that accepts a String as a parameter and returns that String with each 
 *  pair of adjacent letters reversed. If the String has an odd number of letters, the last letter is 
 *  unchanged. For example, the call swapPairs("example") should return "xemalpe" and the call swapPairs("hello there") 
 *  should return "ehll ohtree".
 */
 
public String swapPairs(String word){
    String result = "";
    for(int i = 0; i< word.length()/2; i++){
        result+= word.substring(i*2+1,i*2+2) + word.substring(i*2,i*2+1);
    }
    if(word.length() % 2 != 0){
        result+= word.substring(word.length() - 1);
    }
    return result;
}
