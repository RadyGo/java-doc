/*P258代码*/
import java.awt.*; 
import java.awt.event.*; 
public class DrawLine 
{ 
  Frame f= new Frame("IT人资讯交流网"); 
  public static void main(String [] args) 
  { 
    new DrawLine().init();  
  } 
  public void init() 
  { 
    f.setSize(300,300); 
    f.setVisible(true); 
    f.addMouseListener(new MouseAdapter() 
		  { 
          int orgX; 
          int orgY; 
            public void mousePressed(MouseEvent e) 
            { 
            orgX=e.getX(); 
            orgY=e.getY(); 
            } 
            public void mouseReleased(MouseEvent e) 
          { 
        f.getGraphics().setColor(Color.red); 
//设置绘图颜色为红色 
       f.getGraphics().drawLine(orgX,orgY,e.getX(),e.getY()); 
      }  
     }); 
  }
}