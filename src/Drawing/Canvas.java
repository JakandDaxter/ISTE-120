package Drawing;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Canvas extends JFrame {
	private ArrayList<Object> shapes = new ArrayList();
	private Pane canvas = new Pane();
	private int width;
	private int height;
	
	public Canvas(String title) {
		this.width = 300;
		this.height = 300;
		this.setSize(this.width, this.height);
		this.setLocationRelativeTo((Component)null);
		this.setDefaultCloseOperation(3);
		this.add(this.canvas, "Center");
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public Canvas(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(this.width, this.height);
		this.setLocationRelativeTo((Component)null);
		this.setDefaultCloseOperation(3);
		this.add(this.canvas, "Center");
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public int getWidthInt() {
		return this.width;
	}
	
	public int getHeightInt() {
		return this.height;
	}
	
	public void draw(Shape s) {
		this.shapes.add(s);
		this.canvas.repaint();
	}
	
	public void draw(DrawableString ds) {
		this.shapes.add(ds);
		this.canvas.repaint();
	}
	
	public void erase(Shape s) {
		if (!this.shapes.remove(s)) {
			System.out.println("Cannot erase " + s);
		}
		
		this.canvas.repaint();
	}
	
	public void erase(DrawableString s) {
		if (!this.shapes.remove(s)) {
			System.out.println("Cannot erase " + s);
		}
		
		this.canvas.repaint();
	}
	
	public void animate(Animator an, int delay) {
		for(; an.moveShapes(); this.repaint()) {
			try {
				Thread.currentThread();
				Thread.sleep((long)delay);
			} catch (Exception var4) {
			}
		}
		
	}
	
	public String toString() {
		String var10000 = this.getClass().getName();
		return var10000 + "[width=" + this.getWidth() + ",height=" + this.getHeight() + "]";
	}
	
	public void redraw() {
		this.canvas.repaint();
	}
	
	class Pane extends JPanel {
		Pane() {
		}
		
		public void paintComponent(Graphics g) {
			synchronized(Canvas.this.canvas) {
				super.paintComponent(g);
				Graphics2D g2D = (Graphics2D)g;
				Iterator var4 = Canvas.this.shapes.iterator();
				
				while(var4.hasNext()) {
					Object obj = var4.next();
					g2D.setPaint(Color.BLACK);
					if (obj instanceof Line) {
						g2D.setPaint(((Line)obj).getColor());
					}
					
					if (obj instanceof Circle) {
						g2D.setPaint(((Circle)obj).getColor());
					}
					
					if (obj instanceof Rectangle) {
						g2D.setPaint(((Rectangle)obj).getColor());
					}
					
					if (obj instanceof Triangle) {
						g2D.setPaint(((Triangle)obj).getColor());
					}
					
					if (obj instanceof DrawableString) {
						g2D.setPaint(((DrawableString)obj).getColor());
					}
					
					if (obj instanceof DrawableString) {
						g2D.drawString(((DrawableString)obj).getString(), ((DrawableString)obj).getXInt(), ((DrawableString)obj).getYInt());
					} else {
						g2D.draw((Shape)obj);
					}
					
					if (obj instanceof Circle && ((Circle)obj).getFill()) {
						g2D.fill((Circle)obj);
					}
					
					if (obj instanceof Rectangle && ((Rectangle)obj).getFill()) {
						g2D.fill((Rectangle)obj);
					}
					
					if (obj instanceof Triangle && ((Triangle)obj).getFill()) {
						g2D.fill((Triangle)obj);
					}
				}
				
			}
		}
	}
}

