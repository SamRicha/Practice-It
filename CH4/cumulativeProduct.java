/*
 *  Write code to produce a cumulative product by multiplying together many numbers that are read from 
 *  the console. Match the following format:
 *  
 *  How many numbers? 4
 *  Next number --> 7
 *  Next number --> 2
 *  Next number --> 3
 *  Next number --> 15
 *  Product = 630
 */
 
Scanner scan = new Scanner(System.in);
System.out.print("How many numbers? ");
int numberCount = scan.nextInt();
int cumulativeProduct = 1;
for(int i = 1; i <= numberCount; i++){
    System.out.print("Next number --> ");
    int inputNumber = scan.nextInt();
    cumulativeProduct *= inputNumber;
}
System.out.println("Product = " + cumulativeProduct);
