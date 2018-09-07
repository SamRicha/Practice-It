/*
 *  Write a static method called quadrant that takes as parameters a pair of real numbers representing an (x, y) point 
 *  and that returns the quadrant number for that point. Recall that quadrants are numbered as integers from 1 to 4 
 *  with the upper-right quadrant numbered 1 and the subsequent quadrants numbered in a counter-clockwise fashion:
 */

public static int quadrant(double x, double y){
    int result = 0;
    if(x > 0.0 && y > 0.0){
        result = 1;
    }else if(x < 0.0 && y > 0.0){
        result = 2;
    }else if(x < 0.0 && y < 0.0){
        result = 3;
    }else if(x > 0.0 && y < 0.0){
        result = 4;
    }else if(x == 0.0 || y == 0.0){
        result = 0;
    }
    return result;
}
