package Drawing; import java.awt.Color;
 import java.awt.geom.Line2D;

 public class Line extends Line2D.Double {
   private Color color = Color.BLACK;

   public Line(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
     super(paramInt1, paramInt2, paramInt3, paramInt4);
   }

   public Line(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor) {
     super(paramInt1, paramInt2, paramInt3, paramInt4);
     this.color = paramColor;
   }

   public String toString() {
     return getClass().getName() + "[x1=" + (int)getX1() + ",y1=" + (int)getY1() + ",x2=" +
       (int)getX2() + ",y2=" + (int)getY2() + ",color=" + this.color + "]";
   }

   public int getX1Int() {
    return (int)getX1();
   }

   public int getY1Int() {
     return (int)getY1();
   }

   public int getX2Int() {
     return (int)getX2();
   }

   public int getY2Int() {
    return (int)getY2();
   }

   public Color getColor() {
     return this.color;
   }

   public void setX1Int(int paramInt) {
    setLine(paramInt, getY1(), getX2(), getY2());
   }

   public void setY1Int(int paramInt) {
    setLine(getX1(), paramInt, getX2(), getY2());
   }

   public void setX2Int(int paramInt) {
    setLine(getX1(), getY1(), paramInt, getY2());
   }

   public void setY2Int(int paramInt) {
    setLine(getX1(), getY1(), getX2(), paramInt);
   }

   public void setColor(Color paramColor) {
    this.color = paramColor;
   }
 }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/Line.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */