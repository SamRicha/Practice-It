/*
 *  Write a method named boyGirl that accepts a Scanner as a parameter. The Scanner is reading its input from a 
 *  file containing a series of names followed by integers. The names alternate between boys' names and girls' 
 *  names. Your method should compute the absolute difference between the sum of the boys' integers and the sum 
 *  of the girls' integers. The input could end with either a boy or girl; you may not assume that it contains an 
 *  even number of names. If the input file tas.txt contains the following text:
 *  
 *  Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6
 *  then your method could be called in the following way:
 *  
 *  Scanner input = new Scanner(new File("tas.txt"));
 *  boyGirl(input);
 *  and should produce the following output, since the boys' sum is 27 and the girls' sum is 29:
 *  
 *  4 boys, 3 girls
 *  Difference between boys' and girls' sums: 2
 */

public static void boyGirl(Scanner scan){
    int boySum = 0;
    int boyCounter = 0;
    int girlCounter = 0;
    int girlSum = 0;
    int counter = 0;
    int sum = 0;
    while(scan.hasNext()){
        if(scan.hasNextInt()){
            if(counter % 2 == 0){
                boySum += scan.nextInt();
                boyCounter++;
            }else if(counter % 2 != 0){
                girlSum += scan.nextInt();
                girlCounter++;
            }
            counter++;
        }else if(scan.hasNext()){
             scan.next(); 
         }
    }
    System.out.println(boyCounter + " boys, " + girlCounter + " girls");
    System.out.print("Difference between boys' and girls' sums: ");
    if(boySum >= girlSum){
        System.out.println(boySum - girlSum);
    }else{
        System.out.println(girlSum - boySum);
    }
}
