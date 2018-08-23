/*
 *  Modify your Squares2 program from the previous exercise into a new class Squares3 that draws the following 
 *  figures. (Go back to that problem and copy/paste your code here as a starting point.) Parameterize your 
 *  program so that the figures have the sizes shown below. The top-right figure has size 50, and the bottom-right figure has size 180.
 */

import java.awt.*;

public class Squares3{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(400, 300);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.CYAN);
        
        showDesign(g, 50, 50, 1.0);
        showDesign(g, 250, 10, 0.5);
        showDesign(g, 180, 115, 1.8);
    }
    
    public static void showDesign(Graphics g,int x, int y, double size){
        
        g.setColor(Color.RED);
        for(int i = 0; i < 5; i++){
            g.drawRect(x,y,(int)((20+(20*i))*size),(int)((20+(20*i))*size));
        }
        g.setColor(Color.BLACK);
        g.drawLine(x,y,(int)(x+(100*size)),(int)(y+(100*size)));
    }
}
