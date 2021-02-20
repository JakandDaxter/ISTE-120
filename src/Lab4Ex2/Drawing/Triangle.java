package Lab4Ex2.Drawing;
import java.awt.Color;
import java.awt.Polygon;

public class Triangle extends Polygon {
  private int x;
  
  private int y;
  
  private int width;
  
  private int height;
  
  private boolean fill = false;
  
  private Color color = Color.BLACK;
  
  public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
    this.x = paramInt1;
    this.y = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
  }
  
  public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor) {
    super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
    this.x = paramInt1;
    this.y = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
    this.color = paramColor;
  }
  
  public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
    this.x = paramInt1;
    this.y = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
    this.fill = paramBoolean;
  }
  
  public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor, boolean paramBoolean) {
    super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
    this.x = paramInt1;
    this.y = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
    this.fill = paramBoolean;
    this.color = paramColor;
  }
  
  public String toString() {
    return getClass().getName() + "[x=" + getXInt() + ",y=" + getYInt() + ",width=" + 
      getWidthInt() + ",height=" + getHeightInt() + ",color=" + getColor() + ",fill=" + getFill() + "]";
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
  
  public void setXInt(int paramInt) {
    reset();
    this.x = paramInt;
    addPoint(this.x, this.y + this.height);
    addPoint(this.x + this.width, this.y + this.height);
    addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
  }
  
  public void setYInt(int paramInt) {
    reset();
    this.y = paramInt;
    addPoint(this.x, this.y + this.height);
    addPoint(this.x + this.width, this.y + this.height);
    addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
  }
  
  public void setWidthInt(int paramInt) {
    reset();
    this.width = paramInt;
    addPoint(this.x, this.y + this.height);
    addPoint(this.x + this.width, this.y + this.height);
    addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
  }
  
  public void setHeightInt(int paramInt) {
    reset();
    this.height = paramInt;
    addPoint(this.x, this.y + this.height);
    addPoint(this.x + this.width, this.y + this.height);
    addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
  }
  
  public void setColor(Color paramColor) {
    this.color = paramColor;
  }
  
  public void setFill(boolean paramBoolean) {
    this.fill = paramBoolean;
  }
}