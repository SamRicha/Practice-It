/*
 *  Write a function named switchPairs that switches the order of values in an array in a pairwise fashion. Your function 
 *  should accept an array as a parameter and should switch the order of the first two values, then switch the order of the 
 *  next two, switch the order of the next two, and so on. If there are an odd number of values in the list, the final element 
 *  is not moved.
 *  
 *  For example, if the array initially stores [1, 4, 8, -3, 2, 7, 0], then your function should switch the first pair, (1 and 4), 
 *  the second pair (8 and -3) and the third pair (2 and 7) to yield [4, 1, -3, 8, 7, 2, 0]. The behavior should be the same for 
 *  valid arrays of any type. For example, if an array initially stores [0, "foo", -1, "bar", "baz"], the call of switchPairs 
 *  should change the array's ordering to ["foo", 0, "bar", -1, "baz"].
 */
 
function switchPairs(arrayList){
    var newArrayList = arrayList.slice();
    for(var i = 0; i < newArrayList.length; i++){
        if(i == newArrayList.length - 1){
            
        }else if(i % 2 == 0){
            arrayList[i] = arrayList[i + 1];
            arrayList[i+1] = newArrayList[i];
        }
        if(arrayList.length < 2){
            return arrayList;
        }
    }
    return arrayList;
}
