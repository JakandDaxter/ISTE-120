package Drawing;/*     */ import java.awt.Color;
/*     */ 
/*     */ public class DrawableString {
/*     */   private String string;
/*     */   
/*     */   private int x;
/*     */   
/*     */   private int y;
/*     */   
/*  13 */   private Color color = Color.BLACK;
/*     */   
/*     */   public DrawableString(String paramString, int paramInt1, int paramInt2) {
/*  24 */     this.string = paramString;
/*  25 */     this.x = paramInt1;
/*  26 */     this.y = paramInt2;
/*     */   }
/*     */   
/*     */   public DrawableString(String paramString, int paramInt1, int paramInt2, Color paramColor) {
/*  39 */     this.string = paramString;
/*  40 */     this.x = paramInt1;
/*  41 */     this.y = paramInt2;
/*  42 */     this.color = paramColor;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  52 */     return getClass().getName() + "[string=" + getString() + ",x=" + getXInt() + ",y=" + getYInt() + ",color=" + 
/*  53 */       getColor() + "]";
/*     */   }
/*     */   
/*     */   public String getString() {
/*  60 */     return this.string;
/*     */   }
/*     */   
/*     */   public int getXInt() {
/*  66 */     return this.x;
/*     */   }
/*     */   
/*     */   public int getYInt() {
/*  72 */     return this.y;
/*     */   }
/*     */   
/*     */   public Color getColor() {
/*  78 */     return this.color;
/*     */   }
/*     */   
/*     */   public void setString(String paramString) {
/*  85 */     this.string = paramString;
/*     */   }
/*     */   
/*     */   public void setXInt(int paramInt) {
/*  93 */     this.x = paramInt;
/*     */   }
/*     */   
/*     */   public void setYInt(int paramInt) {
/* 101 */     this.y = paramInt;
/*     */   }
/*     */   
/*     */   public void setColor(Color paramColor) {
/* 108 */     this.color = paramColor;
/*     */   }
/*     */ }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/DrawableString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */