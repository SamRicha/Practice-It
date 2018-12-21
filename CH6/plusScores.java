/*
 *  Write a static method named plusScores that accepts as a parameter a Scanner containing a series of lines that 
 *  represent student records. Each student record takes up two lines of input. The first line has the student's name 
 *  and the second line has a series of plus and minus characters. Below is a sample input:
 *  
 *  Kane, Erica
 *  --+-+
 *  Chandler, Adam
 *  ++-+
 *  Martin, Jake
 *  +++++++
 *  Dillon, Amanda
 *  ++-++-+-
 *  The number of plus/minus characters will vary, but you may assume that at least one such character appears 
 *   and that no other characters appear on the second line of each pair. For each student you should produce a line 
 *   of output withthe student's name followed by a colon followed by the percent of plus characters. For example, 
 *   if the input above is stored in a Scanner called input, the call of plusScores(input); should produce the following output:
 *  
 *  Kane, Erica: 40.0% plus
 *  Chandler, Adam: 75.0% plus
 *  Martin, Jake: 100.0% plus
 *  Dillon, Amanda: 62.5% plus
 */

public static void plusScores(Scanner scan) throws FileNotFoundException{
    double plusCount = 0.0;
    double plusPercent = 0.0;
    while(scan.hasNextLine()){
        String line = scan.nextLine();
        if(line.isEmpty()){
            System.out.println(": 0.0% plus");
            break;
        }else{
            if(line.charAt(0) == '-' || line.charAt(0) == '+'){
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == '+'){
                        plusCount++;
                    }
                }
                plusPercent = (plusCount/line.length())*100;
            }else{
                System.out.print(line + ": ");
            }
            if(line.charAt(0) == '-' || line.charAt(0) == '+'){
                System.out.printf("%.1f%% plus\n", plusPercent);
                plusCount = 0;
            }
        }
    }
}
