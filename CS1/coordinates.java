/*
 *  Rewrite the coordinates method below by factoring to eliminate redundancy. Your code must produce the same results. 
 *  (Practice-It won't be able to tell whether you have maximally factored the problem, but it can tell you whether your 
 *  solution still produces equivalent output in all test cases.)
 *   
 *  public static double getCoordinates(Scanner console) {
 *      System.out.print("x coordinate? ");
 *      double x = console.nextDouble();
 *      int neg;
 *      if (x < 0.0) {
 *          System.out.print("y coordinate? ");
 *          double y = console.nextDouble();
 *          if (y < 0.0) {
 *              neg = 2;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }  else {
 *              neg = 1;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }
 *      } else {
 *          System.out.print("y coordinate? ");
 *          double y = console.nextDouble();
 *          if (y < 0.0) {
 *              neg = 1;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }  else {
 *              neg = 0;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }
 *      }   
 *  }
 *  You do not need to put quotes around your answers.
 */

public static double getCoordinates(Scanner console){
    System.out.print("x coordinate? ");
    double x = console.nextDouble();
    int neg;
    System.out.print("y coordinate? ");
    double y = console.nextDouble();
    if(x < 0.0 && y < 0.0){
        neg = 2;
    }else if(y < 0.0 || x < 0.0 && y > 0.0){
        neg = 1;
    }else{
        neg = 0;
    }
    System.out.println("negatives = " + neg);
    return x + y + neg;
}
