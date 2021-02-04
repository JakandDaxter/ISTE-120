package Drawing;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;
import java.awt.geom.Line2D.Double;

public class Line extends Double {
	private Color color;
	
	public Line(int var1, int var2, int var3, int var4) {
		super((double)var1, (double)var2, (double)var3, (double)var4);
		this.color = Color.BLACK;
	}
	
	public Line(int var1, int var2, int var3, int var4, Color var5) {
		super((double)var1, (double)var2, (double)var3, (double)var4);
		this.color = Color.BLACK;
		this.color = var5;
	}
	
	public String toString() {
		return this.getClass().getName() + "[x1=" + (int)this.getX1() + ",y1=" + (int)this.getY1() + ",x2=" + (int)this.getX2() + ",y2=" + (int)this.getY2() + ",color=" + this.color + "]";
	}
	
	public int getX1Int() {
		return (int)super.getX1();
	}
	
	public int getY1Int() {
		return (int)super.getY1();
	}
	
	public int getX2Int() {
		return (int)super.getX2();
	}
	
	public int getY2Int() {
		return (int)super.getY2();
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setX1Int(int var1) {
		this.setLine((double)var1, this.getY1(), this.getX2(), this.getY2());
	}
	
	public void setY1Int(int var1) {
		this.setLine(this.getX1(), (double)var1, this.getX2(), this.getY2());
	}
	
	public void setX2Int(int var1) {
		this.setLine(this.getX1(), this.getY1(), (double)var1, this.getY2());
	}
	
	public void setY2Int(int var1) {
		this.setLine(this.getX1(), this.getY1(), this.getX2(), (double)var1);
	}
	
	public void setColor(Color var1) {
		this.color = var1;
	}
}
