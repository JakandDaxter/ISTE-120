package labEx3;

import Drawing.Canvas;
import Drawing.Circle;
import Drawing.Rectangle;
import Drawing.Triangle;

import java.awt.*;


/**
 * Picture - This class represents a simple picture. 
 * You can draw the picture using the draw method. But wait, there's more: 
 * being an electronic picture, it can be changed. You can set it to 
 * black-and-white display and back to colors (only after it's been drawn,
 * of course).
 * 
 * @author  D. Patric
 * @version 2205
 */

public class Picture3
{
    private Canvas canvas;
    private Rectangle wall;
    private Rectangle window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture3()
    {
       canvas = new Canvas("Picture", 400, 400);
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Rectangle(40, 140, 100, 100, Color.RED, true);

        window = new Rectangle(60, 160, 30, 30, true);

        roof = new Triangle(20, 100, 140, 40, Color.GREEN, true);
        
        sun = new Circle(180, 20, 20, Color.YELLOW, true);
        
        canvas.draw(wall);
        canvas.draw(window);
        canvas.draw(roof);
        canvas.draw(sun);
    }

    public void setNewColors(){
        roof.setColor(Color.magenta);
        wall.setColor(Color.BLUE);
        sun.setColor(Color.red);
        canvas.redraw();
    }

    public void OrigColor(){
        roof.setColor(Color.GREEN);
        wall.setColor(Color.RED);
        sun.setColor(Color.YELLOW);
        canvas.redraw();
    }
}
