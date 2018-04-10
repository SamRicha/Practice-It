// Modify your code from the previous problem to produce the following output:

/*
* 999999999888888887777777666666555554444333221
* 999999999888888887777777666666555554444333221
* 999999999888888887777777666666555554444333221
* 999999999888888887777777666666555554444333221
*/

public class NestedNumbers3 {
  public static void main(String[] args){
    int h = 9;
    int q = 8;
    int n = 9;
    for(int i = 0; i <= 3; i++){
        for(int k = 0; k <= 8; k++){
            for(int p = 0; p <= q; p++){
                System.out.print(n);
            }
            q--;
            h--;
            n--;
        }
    q = 8;
    h = 9;
    n = 9;
    System.out.println();
    }
  }
}
