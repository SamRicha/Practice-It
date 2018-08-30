/*
 *  Complete the following code that uses the DrawingPanel to draw the following figure, based on your stairs 
 *  code from the previous problem:
 */
 
DrawingPanel panel = new DrawingPanel(110, 110);
Graphics g = panel.getGraphics();
for (int i = 0; i < 10; i++) {
    g.drawRect(95-(10*i),5+(10*i), 10+(10*i), 10);
}
