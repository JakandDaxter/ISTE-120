package Drawing;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;

public class Triangle extends Polygon {
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean fill = false;
	private Color color;
	
	public Triangle(int var1, int var2, int var3, int var4) {
		super(new int[]{var1, var1 + var3, var1 + (int)((double)var3 / 2.0D + 0.5D)}, new int[]{var2 + var4, var2 + var4, var2}, 3);
		this.color = Color.BLACK;
		this.x = var1;
		this.y = var2;
		this.width = var3;
		this.height = var4;
	}
	
	public Triangle(int var1, int var2, int var3, int var4, Color var5) {
		super(new int[]{var1, var1 + var3, var1 + (int)((double)var3 / 2.0D + 0.5D)}, new int[]{var2 + var4, var2 + var4, var2}, 3);
		this.color = Color.BLACK;
		this.x = var1;
		this.y = var2;
		this.width = var3;
		this.height = var4;
		this.color = var5;
	}
	
	public Triangle(int var1, int var2, int var3, int var4, boolean var5) {
		super(new int[]{var1, var1 + var3, var1 + (int)((double)var3 / 2.0D + 0.5D)}, new int[]{var2 + var4, var2 + var4, var2}, 3);
		this.color = Color.BLACK;
		this.x = var1;
		this.y = var2;
		this.width = var3;
		this.height = var4;
		this.fill = var5;
	}
	
	public Triangle(int var1, int var2, int var3, int var4, Color var5, boolean var6) {
		super(new int[]{var1, var1 + var3, var1 + (int)((double)var3 / 2.0D + 0.5D)}, new int[]{var2 + var4, var2 + var4, var2}, 3);
		this.color = Color.BLACK;
		this.x = var1;
		this.y = var2;
		this.width = var3;
		this.height = var4;
		this.fill = var6;
		this.color = var5;
	}
	
	public String toString() {
		return this.getClass().getName() + "[x=" + this.getXInt() + ",y=" + this.getYInt() + ",width=" + this.getWidthInt() + ",height=" + this.getHeightInt() + ",color=" + this.getColor() + ",fill=" + this.getFill() + "]";
	}
	
	public int getXInt() {
		return this.x;
	}
	
	public int getYInt() {
		return this.y;
	}
	
	public int getWidthInt() {
		return this.width;
	}
	
	public int getHeightInt() {
		return this.height;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public boolean getFill() {
		return this.fill;
	}
	
	public void setXInt(int var1) {
		this.reset();
		this.x = var1;
		this.addPoint(this.x, this.y + this.height);
		this.addPoint(this.x + this.width, this.y + this.height);
		this.addPoint(this.x + (int)((double)this.width / 2.0D + 0.5D), this.y);
	}
	
	public void setYInt(int var1) {
		this.reset();
		this.y = var1;
		this.addPoint(this.x, this.y + this.height);
		this.addPoint(this.x + this.width, this.y + this.height);
		this.addPoint(this.x + (int)((double)this.width / 2.0D + 0.5D), this.y);
	}
	
	public void setWidthInt(int var1) {
		this.reset();
		this.width = var1;
		this.addPoint(this.x, this.y + this.height);
		this.addPoint(this.x + this.width, this.y + this.height);
		this.addPoint(this.x + (int)((double)this.width / 2.0D + 0.5D), this.y);
	}
	
	public void setHeightInt(int var1) {
		this.reset();
		this.height = var1;
		this.addPoint(this.x, this.y + this.height);
		this.addPoint(this.x + this.width, this.y + this.height);
		this.addPoint(this.x + (int)((double)this.width / 2.0D + 0.5D), this.y);
	}
	
	public void setColor(Color var1) {
		this.color = var1;
	}
	
	public void setFill(boolean var1) {
		this.fill = var1;
	}
}
