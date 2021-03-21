package Drawing;/*     */ import java.awt.Color;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ 
/*     */ public class Rectangle extends Rectangle2D.Double {
/*     */   private boolean fill = false;
/*     */   
/*  10 */   private Color color = Color.BLACK;
/*     */   
/*     */   public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  20 */     super(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor) {
/*  33 */     super(paramInt1, paramInt2, paramInt3, paramInt4);
/*  34 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/*  47 */     super(paramInt1, paramInt2, paramInt3, paramInt4);
/*  48 */     this.fill = paramBoolean;
/*     */   }
/*     */   
/*     */   public Rectangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor, boolean paramBoolean) {
/*  62 */     super(paramInt1, paramInt2, paramInt3, paramInt4);
/*  63 */     this.fill = paramBoolean;
/*  64 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  72 */     return getClass().getName() + "[x=" + (int)getX() + ",y=" + (int)getY() + ",width=" + 
/*  73 */       (int)getWidth() + ",height=" + (int)getHeight() + ",color=" + getColor() + ",fill=" + getFill() + "]";
/*     */   }
/*     */   
/*     */   public int getXInt() {
/*  81 */     return (int)getX();
/*     */   }
/*     */   
/*     */   public int getYInt() {
/*  88 */     return (int)getY();
/*     */   }
/*     */   
/*     */   public int getWidthInt() {
/*  95 */     return (int)getWidth();
/*     */   }
/*     */   
/*     */   public int getHeightInt() {
/* 102 */     return (int)getHeight();
/*     */   }
/*     */   
/*     */   public Color getColor() {
/* 108 */     return this.color;
/*     */   }
/*     */   
/*     */   public boolean getFill() {
/* 114 */     return this.fill;
/*     */   }
/*     */   
/*     */   public void setXInt(int paramInt) {
/* 120 */     setRect(paramInt, getY(), getWidth(), getHeight());
/*     */   }
/*     */   
/*     */   public void setYInt(int paramInt) {
/* 126 */     setRect(getX(), paramInt, getWidth(), getHeight());
/*     */   }
/*     */   
/*     */   public void setWidthInt(int paramInt) {
/* 132 */     setRect(getX(), getY(), paramInt, getHeight());
/*     */   }
/*     */   
/*     */   public void setHeightInt(int paramInt) {
/* 138 */     setRect(getX(), getY(), getWidth(), paramInt);
/*     */   }
/*     */   
/*     */   public void setColor(Color paramColor) {
/* 144 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public void setFill(boolean paramBoolean) {
/* 150 */     this.fill = paramBoolean;
/*     */   }
/*     */ }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/Rectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */