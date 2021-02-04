package Drawing;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.*;

public class DrawableString {
	private String string;
	private int x;
	private int y;
	private Color color;
	
	public DrawableString(String var1, int var2, int var3) {
		this.color = Color.BLACK;
		this.string = var1;
		this.x = var2;
		this.y = var3;
	}
	
	public DrawableString(String var1, int var2, int var3, Color var4) {
		this.color = Color.BLACK;
		this.string = var1;
		this.x = var2;
		this.y = var3;
		this.color = var4;
	}
	
	public String toString() {
		return this.getClass().getName() + "[string=" + this.getString() + ",x=" + this.getXInt() + ",y=" + this.getYInt() + ",color=" + this.getColor() + "]";
	}
	
	public String getString() {
		return this.string;
	}
	
	public int getXInt() {
		return this.x;
	}
	
	public int getYInt() {
		return this.y;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setString(String var1) {
		this.string = var1;
	}
	
	public void setXInt(int var1) {
		this.x = var1;
	}
	
	public void setYInt(int var1) {
		this.y = var1;
	}
	
	public void setColor(Color var1) {
		this.color = var1;
	}
}

