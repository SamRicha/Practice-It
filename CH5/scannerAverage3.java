/*
 *  Write code that prompts for three integers, averages them, and prints the average. Make your code robust against 
 *  invalid input; if the user types a non-number, re-prompt with the same prompt message. (You may want to look at 
 *  the getInt method discussed in Chapter 5. You can call that method in your solution if you like.) Here is an example dialogue:
 *  
 *  Type an integer: 5
 *  Type an integer: 2
 *  Type an integer: 17
 *  Average: 8.0
 */

Scanner console = new Scanner(System.in);
int num = 0; 
int intCount = 0;
int sum = 0;
double avg = 0.0;
System.out.print("Type an integer: ");
while(intCount < 3){
    if(console.hasNextInt()){
        num = console.nextInt();
        intCount++;
        sum += num;
        if(intCount != 3){
            System.out.print("Type an integer: ");
        }
    }else{
    console.next();
    System.out.print("Type an integer: ");
    }
}
avg = sum/3.0;
System.out.print("Average: " + avg);
