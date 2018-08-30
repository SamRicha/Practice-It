/*
 *  Write a complete program in a class named Face2 that uses the DrawingPanel to draw the following figure, 
 *  based on the face figure from the previous problem. Use a parameterized static method to draw each face without redundancy.
 *  
 *  (You don't need to include any import statements at the top of your program. This class will be re-used in 
 *  the next problem, so you may want to save it to a temporary file before moving on.)
 */

public class Face2 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(320,180);
        Graphics g = panel.getGraphics();
        face(g,10,30);
        face(g,150,50);
    }
    public static void face(Graphics g, int x, int y){
        g.drawOval(x,y,100,100);
        g.setColor(Color.BLUE);
        g.fillOval(x+20,y+30,20,20);
        g.fillOval(x+60,y+30,20,20);
        g.setColor(Color.RED);
        g.drawLine(x+30,y+70,x+70,y+70);
        g.setColor(Color.BLACK);
    }
}
