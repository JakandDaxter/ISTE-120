package Lab4Ex2.Drawing;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangle2D.Double {
  private boolean fill = false;
  
  private Color color = Color.BLACK;
  
  public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.color = paramColor;
  }
  
  public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.fill = paramBoolean;
  }
  
  public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor, boolean paramBoolean) {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.fill = paramBoolean;
    this.color = paramColor;
  }
  
  public String toString() {
    return getClass().getName() + "[x=" + (int)getX() + ",y=" + (int)getY() + ",width=" + 
      (int)getWidth() + ",height=" + (int)getHeight() + ",color=" + getColor() + ",fill=" + getFill() + "]";
  }
  
  public int getXInt() {
    return (int)getX();
  }
  
  public int getYInt() {
    return (int)getY();
  }
  
  public int getWidthInt() {
    return (int)getWidth();
  }
  
  public int getHeightInt() {
    return (int)getHeight();
  }
  
  public Color getColor() {
    return this.color;
  }
  
  public boolean getFill() {
    return this.fill;
  }
  
  public void setXInt(int paramInt) {
    setRect(paramInt, getY(), getWidth(), getHeight());
  }
  
  public void setYInt(int paramInt) {
    setRect(getX(), paramInt, getWidth(), getHeight());
  }
  
  public void setWidthInt(int paramInt) {
    setRect(getX(), getY(), paramInt, getHeight());
  }
  
  public void setHeightInt(int paramInt) {
    setRect(getX(), getY(), getWidth(), paramInt);
  }
  
  public void setColor(Color paramColor) {
    this.color = paramColor;
  }
  
  public void setFill(boolean paramBoolean) {
    this.fill = paramBoolean;
  }
}