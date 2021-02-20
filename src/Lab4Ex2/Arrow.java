package Lab4Ex2;

import Lab4Ex2.Drawing.Canvas;
import Lab4Ex2.Drawing.Rectangle;
import Lab4Ex2.Drawing.Triangle;

import java.awt.*;

public class Arrow {
    private Canvas canvas; // the canvas on which to draw
    private Triangle head; // a filled, B&W head
    private Rectangle shaft; // an unfilled, B&W shaft

    public Arrow(Canvas canvas) {

        this.canvas = canvas;

        this.shaft = new Rectangle(17,569,10,100, Color.BLACK);

        this.head = new Triangle(0,520,50,50,Color.black,true);

    }

    public void draw(){

        canvas.draw(shaft);
        canvas.draw(head);
    }

    public void erase(){

        canvas.erase(shaft);
        canvas.erase(head);
    }

    public void moveUp(){

        shaft.setYInt(shaft.getYInt() - 50);
        canvas.draw(shaft);

        head.setYInt(head.getYInt() - 50);
        canvas.draw(head);
    }

    ////////////////////////
    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Triangle getHead() {
        return head;
    }

    public void setHead(Triangle head) {
        this.head = head;
    }

    public Rectangle getShaft() {
        return shaft;
    }

    public void setShaft(Rectangle shaft) {
        this.shaft = shaft;
    }


}
