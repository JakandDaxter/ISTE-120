package Homework1;
/*Class - This class creates a canvas and draws on the canvas three green triangles,
 one red circle and two rectangles; one pink and one black.
 To create a tree similar to one of a christmas tree.
 @author Aliana Tejeda
 @version 02/01/2021
 */

import java.awt.*;
import javax.swing.*;


public class Tree extends JFrame{
	
      public static void main(String[] args) {
			Tree gr = new Tree();
      
      }
      
      public Tree(){
      	/*
      	creating the frame for the program
      	 */
      	setLayout(new BorderLayout());
      	setSize(500,500);
      	setTitle("Homework 1");
      	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	
      	//center screen
        setLocationRelativeTo(null);
        
        setVisible(true);
        
      }
      
      public void paint(Graphics g){
	      /*
	        creating pink square
	       */
      	g.setColor(Color.MAGENTA);
      	g.fillRect(220,370,20,30);
      	System.out.println("Rectangle PINK: " + g);
	      /*
	    creating black square
	       */
        g.setColor(Color.black);
        g.fillRect(200,400,60,60);
        System.out.println("Rectangle BLACK: " + g);
	      /*
	    creating green triangle
	       */
        g.setColor(Color.green);
        g.fillPolygon(new int[] {170, 290, 230}, new int[] {370, 370, 250}, 3);
        System.out.println("Triangle Green: " + g);
	      /*
	    creating green triangle
	       */
        g.setColor(Color.green);
        g.fillPolygon(new int[] {170, 290, 230}, new int[] {255, 255, 180}, 3);
        System.out.println("Triangle Green: " + g);
	      /*
	    creating green triangle
	       */
        g.setColor(Color.green);
        g.fillPolygon(new int[] {170, 290, 230}, new int[] {185, 185, 135}, 3);
        System.out.println("Triangle Green: " + g);
	      /*
	    Creating red circle
	       */
        g.setColor(Color.red);
        g.fillOval(215,106,30,30);
        System.out.println("Circle RED: " + g);
      }
      
	}


