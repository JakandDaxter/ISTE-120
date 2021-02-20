package Lab4Ex2.Drawing;
import java.awt.Color;

public class DrawableString {
  private String string;
  
  private int x;
  
  private int y;
  
  private Color color = Color.BLACK;
  
  public DrawableString(String paramString, int paramInt1, int paramInt2) {
    this.string = paramString;
    this.x = paramInt1;
    this.y = paramInt2;
  }
  
  public DrawableString(String paramString, int paramInt1, int paramInt2, Color paramColor) {
    this.string = paramString;
    this.x = paramInt1;
    this.y = paramInt2;
    this.color = paramColor;
  }
  
  public String toString() {
    return getClass().getName() + "[string=" + getString() + ",x=" + getXInt() + ",y=" + getYInt() + ",color=" + 
      getColor() + "]";
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
  
  public void setString(String paramString) {
    this.string = paramString;
  }
  
  public void setXInt(int paramInt) {
    this.x = paramInt;
  }
  
  public void setYInt(int paramInt) {
    this.y = paramInt;
  }
  
  public void setColor(Color paramColor) {
    this.color = paramColor;
  }
}