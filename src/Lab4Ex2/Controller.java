package Lab4Ex2;

import Lab4Ex2.Drawing.Canvas;

public class Controller {
    Canvas canvas;
    Arrow arow;

    public Controller() throws Exception{
        arow = new Arrow(new Canvas("Lab04Ex2 - Aliana Tejeda", 300, 700));
        arow.draw(); // draw the arrow at the bottom of the screen
        Thread.sleep(100); // delay a little
        arow.erase();
        arow.moveUp();
        arow.draw();
        Thread.sleep(100); // delay a little
        arow.erase();
        arow.moveUp();
        arow.draw();
        Thread.sleep(100); // delay a little
        arow.erase();
        arow.moveUp();
        arow.draw();
        Thread.sleep(100); // delay a little
        arow.erase();
        arow.moveUp();
        arow.draw();
        Thread.sleep(100); // delay a little
        arow.erase();
        arow.moveUp();
        arow.draw();
        Thread.sleep(100); // delay a little
    }

    public static void main(String[] args) throws Exception{
        new Controller();

    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Arrow getArow() {
        return arow;
    }

    public void setArow(Arrow arow) {
        this.arow = arow;
    }

}
