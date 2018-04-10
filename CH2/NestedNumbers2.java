//Modify your code from the previous problem to produce the following output:

/*
* 99999888887777766666555554444433333222221111100000
* 99999888887777766666555554444433333222221111100000
* 99999888887777766666555554444433333222221111100000
* 99999888887777766666555554444433333222221111100000
* 99999888887777766666555554444433333222221111100000
*/

public class NestedNumbers2 {
  public static void main(String[] args){
    int h = 9;
    for(int i = 0; i <= 4; i++){
        for(int k = 0; k <= 9; k++){
            for(int p = 0; p <= 4; p++){
                System.out.print(h);
            }
            h--;
        }
    h = 9;
    System.out.println();
    }
  }
}
