/*
* Modify the SlashFigure program from the previous exercise to produce a new program SlashFigure2 that uses a global 
* constant for the figure's height. The previous output used a constant height of 6. Here is the outputs for a 
* constant height of 4 and 7 respectively: (If you previously solved Self-Check problems 34 and 35 in the book, 
* you will have created a loop table that will be useful in solving this problem. Use it!)
*/

/*
*     Size 4              
* !!!!!!!!!!!!!!          
* \\!!!!!!!!!!//            
* \\\\!!!!!!////            
* \\\\\\!!//////              
*/

/*         Size 7
* !!!!!!!!!!!!!!!!!!!!!!!!!!
* \\!!!!!!!!!!!!!!!!!!!!!!//
* \\\\!!!!!!!!!!!!!!!!!!////
* \\\\\\!!!!!!!!!!!!!!//////
* \\\\\\\\!!!!!!!!!!////////
* \\\\\\\\\\!!!!!!//////////
* \\\\\\\\\\\\!!////////////
*/

public class SlashFigure2{
    public static final int HEIGHT = 4;
    public static void main(String [] args){
        int width = HEIGHT * 4 - 2;
        int g = 0;
        
        for(int i = 1; i <= HEIGHT;i++){
            
            for(int d = 1; d <= g; d++){ 
                System.out.print("\\");
            }
            for(int u = 1; u <= width; u++){
                System.out.print("!");
            }
            for(int y = 1; y <= g; y++){
                System.out.print("/");
            }
            g+=2;                     
            width-=4;
            System.out.println();
        }
    }
}
