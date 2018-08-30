/*
 *  Write a complete program in a class named Face that uses the DrawingPanel to draw the following figure:
 *  
 *  Java DrawingPanel closemaximizeminimize
 *  expected output
 *  (195, 99)
 *  window size: 220 x 150 px
 *  overall face circle: 100 px in diameter; top-left corner at (10, 30)
 *  eyes: blue circles, 20 px in diameter; top-left at (30, 60) and (70, 60)
 *  mouth: red line from (40, 100) to (80, 100)
 *  (You don't need to include any import statements at the top of your program. This class will be re-used in the next problem, 
 *  so you may want to save it to a temporary file before moving on.)
 */

public class Face {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(220,150);
        Graphics g = panel.getGraphics();
        g.drawOval(10,30,100,100);
        g.setColor(Color.BLUE);
        g.fillOval(30,60,20,20);
        g.fillOval(70,60,20,20);
        g.setColor(Color.RED);
        g.drawLine(40,100,80,100);
    }
}
