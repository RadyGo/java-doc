/*P258代码*/
import java.awt.*; 
import java.awt.event.*; 
public class DrawLine2 
{ 
  Frame f= new Frame("IT人资讯交流网"); 
  public static void main(String [] args) 
  { 
    new DrawLine2().init();  
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
        Graphics g=f.getGraphics(); 
        g.setColor(Color.red);//设置绘图颜色为红色 
        g.setFont(new Font("隶书",Font.ITALIC|Font.BOLD,30)); 
        //设置文本的字体 
        g.drawString(new String(orgX +"," +orgY),orgX,orgY); 
        //打印鼠标按下时的坐标文本 
        g.drawString(new String(e.getX() +"," +e.getY()) 
            ,e.getX(),e.getY()); 
        //打印鼠标释放时的坐标文本 
        g.drawLine(orgX,orgY,e.getX(),e.getY()); 
      }  
    }); 
  } 
} 