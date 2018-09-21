/*
 *  Write a static method named longestName that reads names typed by the user and prints the longest name 
 *  (the name that contains the most characters) in the format shown below. Your method should accept a 
 *  console Scanner and an integer n as parameters and should then prompt for n names.
 */

public static void longestName(Scanner scan, int nameAmount){
    String max = "";
    String name = "";
    int maxTieCount = 0;
    
    for(int i = 1; i <= nameAmount; i++){
        System.out.print("name #" + i + "? ");
        name = scan.next();
        if(i == 1){
            max = name;
        }
        if(name.length() > max.length()){
            max = name;
            maxTieCount = 0;
        }else if(name.length() == max.length() && i != 1){
            maxTieCount++;
        }
    }
    System.out.println(max.substring(0,1).toUpperCase() + max.substring(1).toLowerCase() + "'s name is longest");
    if(maxTieCount > 0){
        System.out.println("(There was a tie!)");
    }
}
