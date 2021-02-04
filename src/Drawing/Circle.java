package Drawing;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.geom.Ellipse2D.Double;

public class Circle extends Double {
	private Color color;
	private boolean fill;
	
	public Circle(int var1, int var2, int var3) {
		super((double)var1, (double)var2, (double)(var3 * 2), (double)(var3 * 2));
		this.color = Color.BLACK;
		this.fill = false;
	}
	
	public Circle(int var1, int var2, int var3, Color var4) {
		super((double)var1, (double)var2, (double)(var3 * 2), (double)(var3 * 2));
		this.color = Color.BLACK;
		this.fill = false;
		this.color = var4;
	}
	
	public Circle(int var1, int var2, int var3, boolean var4) {
		super((double)var1, (double)var2, (double)(var3 * 2), (double)(var3 * 2));
		this.color = Color.BLACK;
		this.fill = false;
		this.fill = var4;
	}
	
	public Circle(int var1, int var2, int var3, Color var4, boolean var5) {
		super((double)var1, (double)var2, (double)(var3 * 2), (double)(var3 * 2));
		this.color = Color.BLACK;
		this.fill = false;
		this.fill = var5;
		this.color = var4;
	}
	
	public String toString() {
		return this.getClass().getName() + "[x=" + (int)this.getX() + ",y=" + (int)this.getY() + ",radius=" + (int)(this.getHeight() / 2.0D) + "color=" + this.getColor() + ",fill=" + this.getFill() + "]";
	}
	
	public int getXInt() {
		return (int)super.getX();
	}
	
	public int getYInt() {
		return (int)super.getY();
	}
	
	public int getRadius() {
		return (int)(super.getWidth() / 2.0D);
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public boolean getFill() {
		return this.fill;
	}
	
	public void setXInt(int var1) {
		this.setFrame((double)var1, this.getY(), this.getWidth(), this.getHeight());
	}
	
	public void setYInt(int var1) {
		this.setFrame(this.getX(), (double)var1, this.getWidth(), this.getHeight());
	}
	
	public void setRadiusInt(int var1) {
		this.setFrame(this.getX(), this.getY(), (double)var1 * 2.0D, (double)var1 * 2.0D);
	}
	
	public void setColor(Color var1) {
		this.color = var1;
	}
	
	public void setFill(boolean var1) {
		this.fill = var1;
	}
}

