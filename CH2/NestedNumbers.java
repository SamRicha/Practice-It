// Write nested for loops that produce the following output:

/*
* 000111222333444555666777888999
* 000111222333444555666777888999
* 000111222333444555666777888999
*/

public class NestedNumbers {
  public static void main(String[] args){
    for(int i = 0; i <= 2; i++){

        for(int k = 0; k <= 9; k++){
            
            for(int f = 0; f <= 2; f++){
                System.out.print(k);
            }
        }
    
    System.out.println();
}
  }
}
