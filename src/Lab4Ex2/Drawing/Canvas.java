package Lab4Ex2.Drawing;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;








 
public class Canvas extends JFrame {
  private ArrayList<Object> shapes = new ArrayList();
  
  private Pane canvas = new Pane();
  
  private int width;
  
  private int height;
  
  public Canvas(String title) {
    this.width = 300;
    this.height = 300;
    setSize(this.width, this.height);
    setLocationRelativeTo((Component)null);
    setDefaultCloseOperation(3);
    add(this.canvas, "Center");
    setTitle(title);
    setVisible(true);
  }
  
  public Canvas(String title, int width, int height) {
    this.width = width;
    this.height = height;
    setSize(this.width, this.height);
    setLocationRelativeTo((Component)null);
    setDefaultCloseOperation(3);
    add(this.canvas, "Center");
    setTitle(title);
    setVisible(true);
  }
  
  public int getWidthInt() {
    return this.width;
  }
  
  public int getHeightInt() {
    return this.height;
  }
  
  public void draw(Shape s) {
    this.shapes.add(s);
    this.canvas.repaint();
  }
  
  public void draw(DrawableString ds) {
    this.shapes.add(ds);
    this.canvas.repaint();
  }
  
  public void erase(Shape s) {
    if (!this.shapes.remove(s))
      System.out.println("Cannot erase " + s); 
    this.canvas.repaint();
  }
  
  public void erase(DrawableString s) {
    if (!this.shapes.remove(s))
      System.out.println("Cannot erase " + s); 
    this.canvas.repaint();
  }
  
  public void animate(Animator an, int delay) {
    while (an.moveShapes()) {
      try {
        Thread.currentThread();
        Thread.sleep(delay);
      } catch (Exception exception) {}
      repaint();
    } 
  }
  
  public String toString() {
    return getClass().getName() + "[width=" + getClass().getName() + ",height=" + getWidth() + "]";
  }
  
  public void redraw() {
    this.canvas.repaint();
  }
  
  class Pane extends JPanel {
    public void paintComponent(Graphics g) {
      synchronized (Canvas.this.canvas) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;
        for (Object obj : Canvas.this.shapes) {
          g2D.setPaint(Color.BLACK);
          if (obj instanceof Line)
            g2D.setPaint(((Line)obj).getColor()); 
          if (obj instanceof Circle)
            g2D.setPaint(((Circle)obj).getColor()); 
          if (obj instanceof Rectangle)
            g2D.setPaint(((Rectangle)obj).getColor()); 
          if (obj instanceof Triangle)
            g2D.setPaint(((Triangle)obj).getColor()); 
          if (obj instanceof DrawableString)
            g2D.setPaint(((DrawableString)obj).getColor()); 
          if (obj instanceof DrawableString) {
            g2D.drawString(((DrawableString)obj).getString(), ((DrawableString)obj)
                .getXInt(), ((DrawableString)obj).getYInt());
          } else {
            g2D.draw((Shape)obj);
          } 
          if (obj instanceof Circle && ((Circle)obj).getFill())
            g2D.fill((Circle)obj); 
          if (obj instanceof Rectangle && ((Rectangle)obj).getFill())
            g2D.fill((Rectangle)obj); 
          if (obj instanceof Triangle && ((Triangle)obj).getFill())
            g2D.fill((Triangle)obj); 
        } 
      } 
    }
  }
}