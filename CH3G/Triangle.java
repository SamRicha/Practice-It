/*
 *  Using the DrawingPanel class, write a Java class named Triangle that produces the following figure:
 *  
 *  size: 600x200
 *  background color: yellow
 *  line color: blue
 *  vertical spacing between lines: 10 px
 *  The diagonal lines connect at the bottom in the middle.
 */
 
public class Triangle {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(600, 200);
        Graphics g = panel.getGraphics();
        int x1 = 15; 
        int x2 = 585; 
        int y1 = 10; 
        int y2 = 10; 

        
        panel.setBackground(Color.YELLOW);
        g.setColor(Color.BLUE);
 
        g.drawLine(0,0,300,200);
        g.drawLine(600,0,300,200);
        
        while(x2 != 0){
            g.drawLine(x1,y1,x2,y2);
            
            x1+=15;
            y1+=10;
            x2-=15;
            y2+=10;
        }
    }
}
