/*
 *  In physics, a common useful equation for finding the position s of a body in linear motion 
 *  at a given time t (in seconds), based on its initial position s0, initial velocity v0, 
 *  and rate of acceleration a, is the following:
 *  
 *  s = s0 + v0 t + 1/2 * at2
 *  
 *  Write a function getDisplacement that takes in parameters s0, t, and v0 and returns 
 *  the resulting position, s, using 9.8 as the acceleration constant for gravity.
 */
 
function getDisplacement(s0, v0, t){
    var s = s0 + v0 * t + 0.5 * 9.8 * (t * t);
    return s;
}
