/*
 *  Write a program in a class named Spiral that uses the DrawingPanel to draw the following figure:
 *
 *  The window is 170 pixels wide and 170 pixels tall. The background is white and the spiral is black. 
 *  The "spiral" lines start from (0, 10), going right 160, down 150, left 150, up 140, right 140, down 130, 
 *  left 130, up 120, ...
 *  
 *  (You don't need to include any import statements at the top of your program.)
*/

public class Spiral {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(170,170);
        Graphics g = panel.getGraphics();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        
        for(int i = 0; i < 8; i++){
            y1=10;
            x2=160;
            y2=10;
            g.drawLine(x1+(10*i),y1+(10*i),x2-(10*i),y2+(10*i));  
        }
        for(int i = 0; i < 8; i++){
            x1=90;
            y1=80;
            x2=90;
            y2=90;
            g.drawLine(x1+(10*i),y1-(10*i),x2+(10*i),y2+(10*i));  
        }
        for(int i = 0; i < 8; i++){
            x1=10;
            y1=20;
            x2=10;
            y2=160;
            g.drawLine(x1+(10*i),y1+(10*i),x2+(10*i),y2-(10*i));  
        }
        for(int i = 0; i < 8; i++){
            x1=10;
            y1=160;
            x2=160;
            y2=160;
            g.drawLine(x1+(10*i),y1-(10*i),x2-(10*i),y2-(10*i));  
        }
    }
}
