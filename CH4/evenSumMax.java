/*
 *  Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum 
 *  of the even numbers. You may assume that the user types at least one non-negative even integer.
 *  
 *  how many integers? 4
 *  next integer? 2
 *  next integer? 9
 *  next integer? 18
 *  next integer? 4
 *  even sum = 24
 *  even max = 18
 */
 
public static void evenSum(){
    int sum = 0;
    int max = 0;
    int num = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("how many integers? ");
    int numAmount = scan.nextInt();
    for(int i = 1; i <= numAmount; i++){
        System.out.print("next integer? ");
        num = scan.nextInt();
        if(i == 1){
            max = num;
        }
        if(num % 2 == 0){
            sum += num; 
        }
        if(num >= max && num % 2 == 0){
            max = num;
        }
    }
    System.out.println("even sum = " + sum);
    System.out.println("even max = " + max);
}
