/*
 *  Write a function named removeAll that accepts an array of Strings and a single String as parameters, and returns
 *  a new array. The returned array should be equivalent to the parameter array but with all occurrences of the 
 *  String parameter removed, ignoring case. The array parameter should remain unchanged as a result of the function 
 *  call. For example, if an array named words contains ["foo", "bar", "baz", "Foo", "FOO"], the call of removeAll(words, "foo") 
 *  should return ["bar", "baz"].
 */
 
function removeAll(stringList, removeString){
    var iterator = 0;
    for(var i = 0; iterator < stringList.length; i++){
        if(stringList[iterator].toLowerCase() == removeString.toLowerCase()){    
            stringList.splice(iterator, 1);
        }else{
            iterator++;
        }
    }
    return stringList;
}
