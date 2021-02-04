package Exercise4;

import Drawing.Canvas;
import Drawing.DrawableString;
import Drawing.Rectangle;

import java.awt.*;

/**
 * Lab01Ex4 -
 * @author Aliana Tejeda
 * @version 1
 */

public class Lab1Ex4 {
	public static void main(String[] args) {
		Drawing.Canvas canvas = new Canvas("Lab01Ex4 - Aliana Tejeda", 900, 500);
		
		Drawing.Circle myCircle0 = new Drawing.Circle(20,330,30, Color.BLACK,true);
		canvas.draw(myCircle0);
		
		Drawing.Circle myCircle1 = new Drawing.Circle(80,330,30, Color.BLACK,true);
		canvas.draw(myCircle1);
		
		Drawing.Circle myCircle2 = new Drawing.Circle(260,330,30, Color.BLACK,true);
		canvas.draw(myCircle2);
		
		Drawing.Circle myCircle3 = new Drawing.Circle(320,330,30, Color.BLACK,true);
		canvas.draw(myCircle3);
		
		Drawing.Circle myCircle4 = new Drawing.Circle(500,330,30, Color.BLACK,true);
		canvas.draw(myCircle4);
		
		Drawing.Rectangle myRectangle0 = new Drawing.Rectangle(260,320,260,10,Color.red,true);
		canvas.draw(myRectangle0);
		
		Drawing.Rectangle myRectangle1 = new Drawing.Rectangle(20,320,120,10,Color.red,true);
		canvas.draw(myRectangle1);
		
		Drawing.Rectangle myRectangle2 = new Drawing.Rectangle(20,219,350,100,Color.BLUE,true);
		canvas.draw(myRectangle2);
		
		Drawing.DrawableString Ajax = new Drawing.DrawableString("AJAX Supplies", 155,270, Color.WHITE);
		canvas.draw(Ajax);
		
		Drawing.Rectangle myRectangle3 = new Drawing.Rectangle(380,220,100,100,Color.RED,true);
		canvas.draw(myRectangle3);
		
		Drawing.Rectangle myRectangle4 = new Drawing.Rectangle(390,230,80,40,Color.BLUE,true);
		canvas.draw(myRectangle4);
		
		Drawing.Rectangle myRectangle5 = new Drawing.Rectangle(480,270,80,60,Color.red,true);
		canvas.draw(myRectangle5);
		

	}
}
