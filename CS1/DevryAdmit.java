/*
 *  Write a complete program in a class named DevryAdmit that uses a Scanner to read user input for a student's grade point 
 *  average and SAT exam score, and uses these values to decide whether the student is admitted to the university. A GPA 
 *  below 1.8 will cause the student to be rejected; an SAT score below 900 will also cause a rejection. Otherwise the 
 *  student is accepted. If both the GPA and the SAT score are too low, print the message about the GPA being too low. 
 *  Your output should match the following examples:
 *  
 *  Devry University admission program
 *  What is your GPA? 3.2
 *  What is your SAT score? 1280
 *  You were accepted!
 *  
 *  Devry University admission program
 *  What is your GPA? 3.95
 *  What is your SAT score? 860
 *  Your SAT score is too low.
 *  
 *  Devry University admission program
 *  What is your GPA? 1.4
 *  What is your SAT score? 1590
 *  Your GPA is too low.
 */


import java.util.Scanner;

public class DevryAdmit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Devry University admission program");
        
        System.out.print("What is your GPA? ");
        double gpa = scan.nextDouble();
        
        System.out.print("What is your SAT score? ");
        int sat = scan.nextInt();
        
        if(gpa >= 1.8 && sat >= 900){
            System.out.println("You were accepted!");
        }else if(gpa < 1.8 && sat >= 900){
            System.out.println("Your GPA is too low.");
        }else if(gpa >= 1.8 && sat <= 900){
            System.out.println("Your SAT score is too low.");
        }else{
            System.out.println("Your GPA is too low.");
        }
    }
}
