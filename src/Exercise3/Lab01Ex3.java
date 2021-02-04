package Exercise3;

import Drawing.Circle;
import Drawing.Canvas;
import java.awt.*;

public class Lab01Ex3 {
	
	/**
	 * Lab01Ex3 - Starter file for Lab01 Exercise 3
	 * @author Aliana Tejeda
	 * @version 1
	 */
	
	public static void main(String[] args) {
		
		Canvas canvas = new Canvas("Lab01Ex3 - Aliana Tejeda", 500, 500);
		
		Circle myCircle = new Circle(20,60,30,Color.BLUE);
		myCircle.setXInt(myCircle.getXInt() + 150);
		//myCircle.setYInt(myCircle.getYInt() + 200);
		canvas.draw(myCircle);
		System.out.println("My Circle: " + myCircle.toString());
	}

}