// Write a method called printDesign that produces the following output. Use nested for loops to capture the structure of the figure.

/*
* -----1-----
* ----333----
* ---55555---
* --7777777--
* -999999999-
*/

public class PrintDesign {
  public static void main(String[] args){
    printDesign();
  }
  public static void printDesign() {
  
    int p = 1;
    int d = 4;
    for(int i = 0; i <= 4; i++){
        for(int s = 0; s <= d; s++){
            System.out.print("-");
        }
        for(int j = 1; j <= p; j++){
            System.out.print(p);
        }
        for(int h = 0; h <= d; h++){
            System.out.print("-");
        }
        d--;
        p+=2;
        System.out.println();
    }
    
}
}
