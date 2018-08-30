/*
Complete the following code that uses the DrawingPanel to draw the following figure:

Java DrawingPanel closemaximizeminimize
expected output
(71, 1)
window size: 110 x 110 px
ten stacked stairs starting at (5, 5), height 10, width starting at 10 and increasing by 10 for each stair
(You don't need to include any import statements at the top of your program.)
*/

DrawingPanel panel = new DrawingPanel(110, 110);
Graphics g = panel.getGraphics();
for (int i = 0; i < 10; i++) {
    g.drawRect(5,5+(10*i), 10+(10*i), 10);
}
