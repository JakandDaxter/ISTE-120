/**
 Course: STE-120-<1> Computational Problem Solving for the Information Domain I
 Exam: Practical 1, Question #1
 Description: A class to draw a castle using Drawing API
 @author Aliana Tejeda
 @version 02/19/2021
 */
package Part1;

import Drawing.Canvas;

import java.awt.*;

public class castle {

    public static void main(String[] args) {
        Canvas canvas = new Canvas("Exam1 - Aliana Tejeda", 300, 400);

        // Rectangles //
        Drawing.Rectangle myRectangle0 = new Drawing.Rectangle(20,180,200,100,Color.RED,true);
        canvas.draw(myRectangle0);

        Drawing.Rectangle myRectangle1 = new Drawing.Rectangle(20,140,20,140,Color.GRAY,true);
        canvas.draw(myRectangle1);

        Drawing.Rectangle myRectangle2 = new Drawing.Rectangle(200,140,20,140,Color.GRAY,true);
        canvas.draw(myRectangle2);

        // Triangles //
        Drawing.Triangle myTriangle0 = new Drawing.Triangle(18,115,25,25,Color.red,true);
        canvas.draw(myTriangle0);

        Drawing.Triangle myTriangle1 = new Drawing.Triangle(198,115,25,25,Color.red,true);
        canvas.draw(myTriangle1);

        //Cirle//
        Drawing.Circle myCircle0 = new Drawing.Circle(95,220,30, Color.BLUE,true);
        canvas.draw(myCircle0);

    }
}

