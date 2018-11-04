/*
 *  Write a function named contains that accepts two arrays a1 and a2 as parameters and that returns a boolean 
 *  value indicating whether or not a2's sequence of elements appears in a1 (true for yes, false for no). The 
 *  sequence of elements in a2 may appear anywhere in a1 but must appear consecutively and in the same order. 
 *  For example, if variables called a1 and a2 store the following values:
 *  
 *  var a1 = [1, 6, 2, 1, 4, 1, 2, 1, 8];
 *  var a2 = [1, 2, 1];
 *  Then the call of contains(a1, a2) should return true because a2's sequence of values [1, 2, 1] is contained 
 *  in a1 starting at index 5. If a2 had stored the values [2, 1, 2], the call of contains(a1, a2) would return 
 *  false because a1 does not contain that sequence of values. Arrays may also include non-integer values, such 
 *  as doubles or strings. Anything that would be considered equal using JavaScript's "==" comparison should be 
 *  considered equivalent in this function. For example, if variables called a3 and a4> store the following values:
 *
 *  var a3 = [false, true, "1", 2.0, 3];
 *  var a4 = ["true", 1, "2"];
 *  Any two arrays with identical elements are considered to contain each other, so a call such as contains(a1, a1) should return true.
 *
 *  You may assume that both arrays passed to your method will have lengths of at least 1.
 */

function contains(a1, a2){
    var containsBool = false;
    var setPlacer = 0;
    
    for(var i = 0; i < a2.length; i++){
        for(var j = 0; j < a1.length; j++){
            if(a1[j] == a2[i] && a1[j+1] == a2[i+1] && a1[j+2] == a2[i+2]){
                setPlacer = j;

                for(var k = 0; k < a2.length; k++){
                    if(a1[setPlacer] == a2[k]){
                        setPlacer++;
                    }else{
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
