/*
 *  Write a sentinel loop that repeatedly prompts the user to enter a number and, once the number -1 is typed, displays the maximum and minimum numbers that the user entered. Here is a sample dialogue:
 *  
 *  Type a number (or -1 to stop): 5
 *  Type a number (or -1 to stop): 2
 *  Type a number (or -1 to stop): 17
 *  Type a number (or -1 to stop): 8
 *  Type a number (or -1 to stop): -1
 *  Maximum was 17
 *  Minimum was 2
 */
 
int max = 0;
int min = 0;
int num = 0;
int iterationCount = 0;
Scanner scan = new Scanner(System.in);
do{
    System.out.print("Type a number (or -1 to stop): ");
    num = scan.nextInt();
    if(iterationCount == 0){
        max = num;
        min = num;
    }
    if(num > max){
        max = num;
    }else if(num < min && num != -1){
        min = num;
    }
    iterationCount++;
}while(num != -1);
if(max == -1 && min == -1){
    
}else{
    System.out.println("Maximum was " + max);
    System.out.println("Minimum was " + min);
}
