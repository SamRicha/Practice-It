/*
* Write a Java program in a class named Window that produces the preceding figure as output. Use nested for loops 
* to print the repeated parts of the figure. Once you get it to work, add one class constant to your program so 
* that the size of the figure can be changed simply by changing that constant's value. The example output shown 
* is at a constant size of 3, but if you change the constant, the figure should grow larger and wider proportionally.
*/

/*
* +===+===+
* |   |   |
* |   |   |
* |   |   |
* +===+===+
* |   |   |
* |   |   |
* |   |   |
* +===+===+
*/

public class Window{
    public static final int SIZE = 3;
    public static void main(String [] args){
        
        System.out.print("+");
        
        for(int i = 1; i <= 2; i++){
            
            for(int c = 1; c <= SIZE; c++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        
        System.out.println();
        
        for(int d = 1; d <= SIZE; d++){
            System.out.print("|");
                
                for(int v = 1; v <= SIZE; v++){
                
                    System.out.print(" ");
                }
            
                System.out.print("|");
                
                for(int v = 1; v <= SIZE; v++){
                
                    System.out.print(" ");
                }
            
                System.out.println("|");
        } 
           
        System.out.print("+");
        
        for(int i = 1; i <= 2; i++){
            
            for(int c = 1; c <= SIZE; c++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        
        System.out.println();
        
        for(int d = 1; d <= SIZE; d++){
            System.out.print("|");
                
                for(int v = 1; v <= SIZE; v++){
                
                    System.out.print(" ");
                }
            
                System.out.print("|");
                
                for(int v = 1; v <= SIZE; v++){
                
                    System.out.print(" ");
                }
            
                System.out.println("|");
        } 
        
        System.out.print("+");
        
        for(int i = 1; i <= 2; i++){
            
            for(int c = 1; c <= SIZE; c++){
                System.out.print("=");
            }
            System.out.print("+");
        }
    }
}
