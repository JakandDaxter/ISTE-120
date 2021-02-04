package Drawing;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.geom.Rectangle2D.Double;

public class Rectangle extends Double {
	private boolean fill = false;
	private Color color;
	
	public Rectangle(int var1, int var2, int var3, int var4) {
		super((double)var1, (double)var2, (double)var3, (double)var4);
		this.color = Color.BLACK;
	}
	
	public Rectangle(int var1, int var2, int var3, int var4, Color var5) {
		super((double)var1, (double)var2, (double)var3, (double)var4);
		this.color = Color.BLACK;
		this.color = var5;
	}
	
	public Rectangle(int var1, int var2, int var3, int var4, boolean var5) {
		super((double)var1, (double)var2, (double)var3, (double)var4);
		this.color = Color.BLACK;
		this.fill = var5;
	}
	
	public Rectangle(int var1, int var2, int var3, int var4, Color var5, boolean var6) {
		super((double)var1, (double)var2, (double)var3, (double)var4);
		this.color = Color.BLACK;
		this.fill = var6;
		this.color = var5;
	}
	
	public String toString() {
		return this.getClass().getName() + "[x=" + (int)this.getX() + ",y=" + (int)this.getY() + ",width=" + (int)this.getWidth() + ",height=" + (int)this.getHeight() + ",color=" + this.getColor() + ",fill=" + this.getFill() + "]";
	}
	
	public int getXInt() {
		return (int)super.getX();
	}
	
	public int getYInt() {
		return (int)super.getY();
	}
	
	public int getWidthInt() {
		return (int)super.getWidth();
	}
	
	public int getHeightInt() {
		return (int)super.getHeight();
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public boolean getFill() {
		return this.fill;
	}
	
	public void setXInt(int var1) {
		this.setRect((double)var1, this.getY(), this.getWidth(), this.getHeight());
	}
	
	public void setYInt(int var1) {
		this.setRect(this.getX(), (double)var1, this.getWidth(), this.getHeight());
	}
	
	public void setWidthInt(int var1) {
		this.setRect(this.getX(), this.getY(), (double)var1, this.getHeight());
	}
	
	public void setHeightInt(int var1) {
		this.setRect(this.getX(), this.getY(), this.getWidth(), (double)var1);
	}
	
	public void setColor(Color var1) {
		this.color = var1;
	}
	
	public void setFill(boolean var1) {
		this.fill = var1;
	}
}

