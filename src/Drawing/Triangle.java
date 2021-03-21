package Drawing;/*     */ import java.awt.Color;
/*     */ import java.awt.Polygon;
/*     */ 
/*     */ public class Triangle extends Polygon {
/*     */   private int x;
/*     */   
/*     */   private int y;
/*     */   
/*     */   private int width;
/*     */   
/*     */   private int height;
/*     */   
/*     */   private boolean fill = false;
/*     */   
/*  15 */   private Color color = Color.BLACK;
/*     */   
/*     */   public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  27 */     super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
/*  28 */     this.x = paramInt1;
/*  29 */     this.y = paramInt2;
/*  30 */     this.width = paramInt3;
/*  31 */     this.height = paramInt4;
/*     */   }
/*     */   
/*     */   public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor) {
/*  45 */     super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
/*  46 */     this.x = paramInt1;
/*  47 */     this.y = paramInt2;
/*  48 */     this.width = paramInt3;
/*  49 */     this.height = paramInt4;
/*  50 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/*  64 */     super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
/*  65 */     this.x = paramInt1;
/*  66 */     this.y = paramInt2;
/*  67 */     this.width = paramInt3;
/*  68 */     this.height = paramInt4;
/*  69 */     this.fill = paramBoolean;
/*     */   }
/*     */   
/*     */   public Triangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor, boolean paramBoolean) {
/*  84 */     super(new int[] { paramInt1, paramInt1 + paramInt3, paramInt1 + (int)(paramInt3 / 2.0D + 0.5D) }, new int[] { paramInt2 + paramInt4, paramInt2 + paramInt4, paramInt2 }, 3);
/*  85 */     this.x = paramInt1;
/*  86 */     this.y = paramInt2;
/*  87 */     this.width = paramInt3;
/*  88 */     this.height = paramInt4;
/*  89 */     this.fill = paramBoolean;
/*  90 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  99 */     return getClass().getName() + "[x=" + getXInt() + ",y=" + getYInt() + ",width=" + 
/* 100 */       getWidthInt() + ",height=" + getHeightInt() + ",color=" + getColor() + ",fill=" + getFill() + "]";
/*     */   }
/*     */   
/*     */   public int getXInt() {
/* 107 */     return this.x;
/*     */   }
/*     */   
/*     */   public int getYInt() {
/* 113 */     return this.y;
/*     */   }
/*     */   
/*     */   public int getWidthInt() {
/* 119 */     return this.width;
/*     */   }
/*     */   
/*     */   public int getHeightInt() {
/* 125 */     return this.height;
/*     */   }
/*     */   
/*     */   public Color getColor() {
/* 131 */     return this.color;
/*     */   }
/*     */   
/*     */   public boolean getFill() {
/* 137 */     return this.fill;
/*     */   }
/*     */   
/*     */   public void setXInt(int paramInt) {
/* 144 */     reset();
/* 145 */     this.x = paramInt;
/* 146 */     addPoint(this.x, this.y + this.height);
/* 147 */     addPoint(this.x + this.width, this.y + this.height);
/* 148 */     addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
/*     */   }
/*     */   
/*     */   public void setYInt(int paramInt) {
/* 156 */     reset();
/* 157 */     this.y = paramInt;
/* 158 */     addPoint(this.x, this.y + this.height);
/* 159 */     addPoint(this.x + this.width, this.y + this.height);
/* 160 */     addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
/*     */   }
/*     */   
/*     */   public void setWidthInt(int paramInt) {
/* 168 */     reset();
/* 169 */     this.width = paramInt;
/* 170 */     addPoint(this.x, this.y + this.height);
/* 171 */     addPoint(this.x + this.width, this.y + this.height);
/* 172 */     addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
/*     */   }
/*     */   
/*     */   public void setHeightInt(int paramInt) {
/* 180 */     reset();
/* 181 */     this.height = paramInt;
/* 182 */     addPoint(this.x, this.y + this.height);
/* 183 */     addPoint(this.x + this.width, this.y + this.height);
/* 184 */     addPoint(this.x + (int)(this.width / 2.0D + 0.5D), this.y);
/*     */   }
/*     */   
/*     */   public void setColor(Color paramColor) {
/* 191 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public void setFill(boolean paramBoolean) {
/* 197 */     this.fill = paramBoolean;
/*     */   }
/*     */ }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/Triangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */