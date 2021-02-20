package Drawing;/*     */ import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ public class Canvas extends JFrame {
/*  13 */   private ArrayList<Object> shapes = new ArrayList();
/*     */   
/*  14 */   private Pane canvas = new Pane();
/*     */   
/*     */   private int width;
/*     */   
/*     */   private int height;
/*     */   
/*     */   public Canvas(String title) {
/*  24 */     this.width = 300;
/*  25 */     this.height = 300;
/*  26 */     setSize(this.width, this.height);
/*  27 */     setLocationRelativeTo((Component)null);
/*  28 */     setDefaultCloseOperation(3);
/*  29 */     add(this.canvas, "Center");
/*  30 */     setTitle(title);
/*  31 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public Canvas(String title, int width, int height) {
/*  42 */     this.width = width;
/*  43 */     this.height = height;
/*  44 */     setSize(this.width, this.height);
/*  45 */     setLocationRelativeTo((Component)null);
/*  46 */     setDefaultCloseOperation(3);
/*  47 */     add(this.canvas, "Center");
/*  48 */     setTitle(title);
/*  49 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public int getWidthInt() {
/*  56 */     return this.width;
/*     */   }
/*     */   
/*     */   public int getHeightInt() {
/*  62 */     return this.height;
/*     */   }
/*     */   
/*     */   public void draw(Shape s) {
/*  70 */     this.shapes.add(s);
/*  71 */     this.canvas.repaint();
/*     */   }
/*     */   
/*     */   public void draw(DrawableString ds) {
/*  79 */     this.shapes.add(ds);
/*  80 */     this.canvas.repaint();
/*     */   }
/*     */   
/*     */   public void erase(Shape s) {
/*  88 */     if (!this.shapes.remove(s))
/*  88 */       System.out.println("Cannot erase " + s); 
/*  89 */     this.canvas.repaint();
/*     */   }
/*     */   
/*     */   public void erase(DrawableString s) {
/*  97 */     if (!this.shapes.remove(s))
/*  97 */       System.out.println("Cannot erase " + s); 
/*  98 */     this.canvas.repaint();
/*     */   }
/*     */   
/*     */   public void animate(Animator an, int delay) {
/* 110 */     while (an.moveShapes()) {
/*     */       try {
/* 111 */         Thread.currentThread();
/* 111 */         Thread.sleep(delay);
/* 111 */       } catch (Exception exception) {}
/* 112 */       repaint();
/*     */     } 
/*     */   }
/*     */   
/*     */   public String toString() {
/* 122 */     return getClass().getName() + "[width=" + getClass().getName() + ",height=" + getWidth() + "]";
/*     */   }
/*     */   
/*     */   public void redraw() {
/* 128 */     this.canvas.repaint();
/*     */   }
/*     */   
/*     */   class Pane extends JPanel {
/*     */     public void paintComponent(Graphics g) {
/* 135 */       synchronized (Canvas.this.canvas) {
/* 136 */         super.paintComponent(g);
/* 137 */         Graphics2D g2D = (Graphics2D)g;
/* 138 */         for (Object obj : Canvas.this.shapes) {
/* 139 */           g2D.setPaint(Color.BLACK);
/* 140 */           if (obj instanceof Line)
/* 140 */             g2D.setPaint(((Line)obj).getColor()); 
/* 141 */           if (obj instanceof Circle)
/* 141 */             g2D.setPaint(((Circle)obj).getColor()); 
/* 142 */           if (obj instanceof Rectangle)
/* 142 */             g2D.setPaint(((Rectangle)obj).getColor()); 
/* 143 */           if (obj instanceof Triangle)
/* 143 */             g2D.setPaint(((Triangle)obj).getColor()); 
/* 144 */           if (obj instanceof DrawableString)
/* 144 */             g2D.setPaint(((DrawableString)obj).getColor()); 
/* 145 */           if (obj instanceof DrawableString) {
/* 146 */             g2D.drawString(((DrawableString)obj).getString(), ((DrawableString)obj)
/* 147 */                 .getXInt(), ((DrawableString)obj).getYInt());
/*     */           } else {
/* 149 */             g2D.draw((Shape)obj);
/*     */           } 
/* 150 */           if (obj instanceof Circle && ((Circle)obj).getFill())
/* 150 */             g2D.fill((Circle)obj); 
/* 151 */           if (obj instanceof Rectangle && ((Rectangle)obj).getFill())
/* 151 */             g2D.fill((Rectangle)obj); 
/* 152 */           if (obj instanceof Triangle && ((Triangle)obj).getFill())
/* 152 */             g2D.fill((Triangle)obj); 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/MS1/Documents/ISTE/Drawing.jar!/Canvas.class
 * Java compiler version: 14 (58.0)
 * JD-Core Version:       1.1.3
 */