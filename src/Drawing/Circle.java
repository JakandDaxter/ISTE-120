package Drawing;/*     */ import java.awt.Color;
/*     */ import java.awt.geom.Ellipse2D;
/*     */ 
/*     */ public class Circle extends Ellipse2D.Double {
/*   9 */   private Color color = Color.BLACK;
/*     */   
/*     */   private boolean fill = false;
/*     */   
/*     */   public Circle(int paramInt1, int paramInt2, int paramInt3) {
/*  18 */     super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
/*     */   }
/*     */   
/*     */   public Circle(int paramInt1, int paramInt2, int paramInt3, Color paramColor) {
/*  30 */     super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
/*  31 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public Circle(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  43 */     super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
/*  44 */     this.fill = paramBoolean;
/*     */   }
/*     */   
/*     */   public Circle(int paramInt1, int paramInt2, int paramInt3, Color paramColor, boolean paramBoolean) {
/*  58 */     super(paramInt1, paramInt2, (paramInt3 * 2), (paramInt3 * 2));
/*  59 */     this.fill = paramBoolean;
/*  60 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  68 */     return getClass().getName() + "[x=" + (int)getX() + ",y=" + (int)getY() + ",radius=" + 
/*  69 */       (int)(getHeight() / 2.0D) + "color=" + getColor() + ",fill=" + getFill() + "]";
/*     */   }
/*     */   
/*     */   public int getXInt() {
/*  77 */     return (int)getX();
/*     */   }
/*     */   
/*     */   public int getYInt() {
/*  84 */     return (int)getY();
/*     */   }
/*     */   
/*     */   public int getRadius() {
/*  92 */     return (int)(getWidth() / 2.0D);
/*     */   }
/*     */   
/*     */   public Color getColor() {
/*  98 */     return this.color;
/*     */   }
/*     */   
/*     */   public boolean getFill() {
/* 104 */     return this.fill;
/*     */   }
/*     */   
/*     */   public void setXInt(int paramInt) {
/* 110 */     setFrame(paramInt, getY(), getWidth(), getHeight());
/*     */   }
/*     */   
/*     */   public void setYInt(int paramInt) {
/* 116 */     setFrame(getX(), paramInt, getWidth(), getHeight());
/*     */   }
/*     */   
/*     */   public void setRadiusInt(int paramInt) {
/* 122 */     setFrame(getX(), getY(), paramInt * 2.0D, paramInt * 2.0D);
/*     */   }
/*     */   
/*     */   public void setColor(Color paramColor) {
/* 128 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public void setFill(boolean paramBoolean) {
/* 134 */     this.fill = paramBoolean;
/*     */   }
/*     */ }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/Circle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */