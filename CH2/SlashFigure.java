/*
* Write a Java program in a class named SlashFigure that produces the following output. 
* Use nested for loops to capture the structure of the figure. (If you previously solved 
* Self-Check problems 34 and 35 in the book, you will have created a loop table that will be 
* useful in solving this problem. Use it!)
*/

/*
* !!!!!!!!!!!!!!!!!!!!!!
* \\!!!!!!!!!!!!!!!!!!//
* \\\\!!!!!!!!!!!!!!////
* \\\\\\!!!!!!!!!!//////
* \\\\\\\\!!!!!!////////
* \\\\\\\\\\!!//////////
*/

public class SlashFigure{
    public static void main(String [] args){
        int q = 21;
        int g = 0;
        for(int i = 0; i <= 5;i++){
            
            for(int d = 1; d <= g; d++){ 
                System.out.print("\\");
            }
            for(int u = 0; u <= q; u++){
                System.out.print("!");
            }
            for(int y = 1; y <= g; y++){
                System.out.print("/");
            }
            g+=2;                     
            q-=4;
            System.out.println();
        }
    }
}
