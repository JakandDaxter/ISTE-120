package Lab4Ex2.Drawing;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Circle extends Ellipse2D.Double {
 private Color color = Color.BLACK;
 
 private boolean fill = false;
 
 public Circle(int paramInt1, int paramInt2, int paramInt3) {
   super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
 }
 
 public Circle(int paramInt1, int paramInt2, int paramInt3, Color paramColor) {
   super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
   this.color = paramColor;
 }
 
 public Circle(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
   super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
   this.fill = paramBoolean;
 }
 
 public Circle(int paramInt1, int paramInt2, int paramInt3, Color paramColor, boolean paramBoolean) {
   super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
   this.fill = paramBoolean;
   this.color = paramColor;
 }
 
 public String toString() {
   return getClass().getName() + "[x=" + (int)getX() + ",y=" + (int)getY() + ",radius=" + 
     (int)(getHeight() / 2.0D) + "color=" + getColor() + ",fill=" + getFill() + "]";
 }
 
 public int getXInt() {
   return (int)getX();
 }
 
 public int getYInt() {
   return (int)getY();
 }
 
 public int getRadius() {
   return (int)(getWidth() / 2.0D);
 }
 
 public Color getColor() {
   return this.color;
 }
 
 public boolean getFill() {
   return this.fill;
 }
 
 public void setXInt(int paramInt) {
   setFrame(paramInt, getY(), getWidth(), getHeight());
 }
 
 public void setYInt(int paramInt) {
   setFrame(getX(), paramInt, getWidth(), getHeight());
 }
 
 public void setRadiusInt(int paramInt) {
   setFrame(getX(), getY(), paramInt * 2.0D, paramInt * 2.0D);
 }
 
 public void setColor(Color paramColor) {
   this.color = paramColor;
 }
 
 public void setFill(boolean paramBoolean) {
   this.fill = paramBoolean;
 }
}



