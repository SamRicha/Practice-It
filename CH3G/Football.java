/*
 *  Using the DrawingPanel class, write a Java class named Football that produces the following figure:
 *  
 *  Though the figure looks to contain curves, it is made entirely of straight lines. The window is 250 x 250 pixels 
 *  in size, and there is an outer rectangle from (10, 30) to (210, 230). A set of black lines are drawn around the 
 *  edges every 10 pixels. For example, along the top-left, there is a line from (10, 220) to (20, 30), a line from 
 *  (10, 210) to (30, 30), a line from (10, 200) to (40, 30), ... and so on. Along the bottom-right, there is a line 
 *  from (20, 230) to (210, 220), a line from (30, 230) to (210, 210), and so on.
 */
 
 public class Football {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250,250);
        Graphics g = panel.getGraphics();
        g.drawRect(10,30, 200,200);
        ballLines(g,10,220,20,30);
        ballLines(g,20,230,210,220);
    }
    public static void ballLines(Graphics g, int x1, int y1, int x2, int y2){        
        if(x1 == 10){
            while(y1 != 0 && x2 !=210){
                g.drawLine(x1,y1,x2,y2);
                y1-=10;
                x2+=10;
            }
        }else{
             while(y2 != 0 && x1 != 210){
                g.drawLine(x1,y1,x2,y2);
                x1+=10;
                y2-=10;
            }
        }
    }
}
