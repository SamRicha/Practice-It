/*
 *  Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with 
 *  two of that string. For example, if the list stores the values {"how", "are", "you?"} before the method is called, 
 *  it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
 */

public ArrayList<String> doubleList(ArrayList<String> stringList){
    int oldSize = stringList.size();
    String word = "";
    for(int i = 0; i < oldSize; i++){
        word = stringList.get(2*i);
        stringList.add(2*i+1,word);
    }
    return stringList;
}
