/*
 *  Write a program in a class named Squares that uses the DrawingPanel to draw the following figure:
 *  
 *  The drawing panel is 300 pixels wide by 200 pixels high. Its background is cyan. The horizontal and 
 *  vertical lines are drawn in red and the diagonal line is drawn in black. The upper-left corner of the 
 *  diagonal line is at (50,50). Successive horizontal and vertical lines are spaced 20 pixels apart. The 
 *  diagonal line is drawn on top of the horizontal and vertical lines.
 */

import java.awt.*;

public class Squares {
    public static void main(String[] args){
        int num1 = 300;
        int num2 = 200;
        
        showDesign(num1, num2);
    }
    
    public static void showDesign(int num1, int num2){
        DrawingPanel panel = new DrawingPanel(num1, num2);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.CYAN);
        g.setColor(Color.RED);
        for(int i = 0; i < 5; i++){
            g.drawRect(50,50,20+(20*i),20+(20*i));
        }
        g.setColor(Color.BLACK);
        g.drawLine(50,50,150,150);
    }
}
