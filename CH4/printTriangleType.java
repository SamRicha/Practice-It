/*
 *  Write a method called printTriangleType that accepts three integer arguments representing the lengths of the 
 *  sides of a triangle and prints what type of triangle it is. The three types are equilateral, isosceles, and 
 *  scalene. An equilateral triangle has all three sides the same length, an isosceles triangle has two sides the 
 *  same length, and a scalene triangle has three sides of different lengths. Here are some example calls to printTriangleType:
 *  
 *  printTriangleType(5, 7, 7);
 *  printTriangleType(6, 6, 6);
 *  printTriangleType(5, 7, 8);
 *  printTriangleType(12, 18, 12);
 *  The output produced should be the following:
 *  
 *  isosceles
 *  equilateral
 *  scalene
 *  isosceles
 */
 
public static void printTriangleType(int num1, int num2, int num3){
    if(num1 != num2 && num1 != num3 && num2 != num3){
        System.out.println("scalene");
    }else if(num1 == num2 && num1 != num3 || num1 == num3 && num1 != num2 || num2 == num1 &&
             num2 != num3 || num3 == num1 && num3 != num2 || num3 == num2 && num3 != num1){
        System.out.println("isosceles");
    }else if(num1 == num2 && num1 == num3){
        System.out.println("equilateral");
    }
}
