/*
 *  Write a method named showTwos that shows the factors of 2 in a given integer. For example, the following calls:
 *  
 *  showTwos(7);
 *  showTwos(18);
 *  showTwos(68);
 *  showTwos(120);
 *  should produce this output:
 *  
 *  7 = 7
 *  18 = 2 * 9
 *  68 = 2 * 2 * 17
 *  120 = 2 * 2 * 2 * 15
 */

public static void showTwos(int num){
    String numList = num + " = ";
    int twoCount = 0;
    if(num % 2 == 0){
        while(num % 2 == 0){
            num /= 2;
            numList += "2 * ";
        }
    }
        System.out.println(numList + num);
}
