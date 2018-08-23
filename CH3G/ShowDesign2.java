/*
 *  Modify your ShowDesign class from the previous exercise into a new class ShowDesign2 that 
 *  has a method named showDesign that accepts parameters for the window width and height and 
 *  displays the rectangles at the appropriate sizes. For example, if your showDesign method 
 *  was called with values of 300 and 100, the window would look like the following figure.
 */
 
import java.awt.*;
public class ShowDesign2 {
    public static void main(String[] args){
        int num1 = 300;
        int num2 = 100;
        
        showDesign(num1, num2);
    }
    
    public static void showDesign(int num1, int num2){
        DrawingPanel panel = new DrawingPanel(num1, num2);
        Graphics g = panel.getGraphics();
        for(int i = 0; i < 4; i++){
            g.drawRect(((num1/2)-(num1/10))-i*(num1/10),((num2/2)-(num2/10))-i*(num2/10),
                       ((num1/10)+(num1/10))+i*((num1/10)+(num1/10)),((num2/10)+(num2/10))+i*((num2/10)+(num2/10)));
        }
    }
}
