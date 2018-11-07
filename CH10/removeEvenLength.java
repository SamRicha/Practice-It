/*
 *  Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes 
 *  all of the strings of even length from the list.
 */

public ArrayList<String> removeEvenLength(ArrayList<String> stringList){
    int incrementor = 0;
    for(int i = 0; incrementor < stringList.size(); i++){
        if(stringList.get(incrementor).length() % 2 == 0){
            stringList.remove(incrementor);
        }else{
            incrementor++;
        }
    }
    return stringList;
}
