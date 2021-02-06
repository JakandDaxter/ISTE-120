package Drawing;/*     */ import java.awt.Color;
/*     */ import java.awt.geom.Line2D;
/*     */ 
/*     */ public class Line extends Line2D.Double {
/*   9 */   private Color color = Color.BLACK;
/*     */   
/*     */   public Line(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  19 */     super(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public Line(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor) {
/*  31 */     super(paramInt1, paramInt2, paramInt3, paramInt4);
/*  32 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  40 */     return getClass().getName() + "[x1=" + (int)getX1() + ",y1=" + (int)getY1() + ",x2=" + 
/*  41 */       (int)getX2() + ",y2=" + (int)getY2() + ",color=" + this.color + "]";
/*     */   }
/*     */   
/*     */   public int getX1Int() {
/*  49 */     return (int)getX1();
/*     */   }
/*     */   
/*     */   public int getY1Int() {
/*  56 */     return (int)getY1();
/*     */   }
/*     */   
/*     */   public int getX2Int() {
/*  63 */     return (int)getX2();
/*     */   }
/*     */   
/*     */   public int getY2Int() {
/*  70 */     return (int)getY2();
/*     */   }
/*     */   
/*     */   public Color getColor() {
/*  76 */     return this.color;
/*     */   }
/*     */   
/*     */   public void setX1Int(int paramInt) {
/*  82 */     setLine(paramInt, getY1(), getX2(), getY2());
/*     */   }
/*     */   
/*     */   public void setY1Int(int paramInt) {
/*  88 */     setLine(getX1(), paramInt, getX2(), getY2());
/*     */   }
/*     */   
/*     */   public void setX2Int(int paramInt) {
/*  94 */     setLine(getX1(), getY1(), paramInt, getY2());
/*     */   }
/*     */   
/*     */   public void setY2Int(int paramInt) {
/* 100 */     setLine(getX1(), getY1(), getX2(), paramInt);
/*     */   }
/*     */   
/*     */   public void setColor(Color paramColor) {
/* 106 */     this.color = paramColor;
/*     */   }
/*     */ }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/Line.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */