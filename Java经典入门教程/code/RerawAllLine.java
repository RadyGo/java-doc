/*P262*/
import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 
import javax.swing.*; 
class MyLine 
{ 
  private int x1; 
  private int y1; 
  private int x2; 
  private int y2; 
  public MyLine(int x1,int y1,int x2,int y2) 
  { 
    this.x1=x1; 
    this.y1=y1; 
    this.x2=x2; 
    this.y2=y2; 
  } 
  public void drawMe(Graphics g) 
  { 
    g.drawLine(x1,y1,x2,y2); 
  } 
  }
public class RerawAllLine extends Frame 
{ 
  Vector vLines=new Vector(); 
  public static void main(String [] args) 
  { 
    RedrawAllLine f=new RedrawAllLine(); 
    f.init(); 
  } 
  public void paint(Graphics g) 
  { 
    g.setColor(Color.red); 
    Enumeration e=vLines.elements(); 
    while(e.hasMoreElements()) 
    { 
      MyLine ln=(MyLine)e.nextElement(); 
      ln.drawMe(g); 
    } 
  } 
 
  public void init() 
  { 
    this.addWindowListener(new WindowAdapter(){ 
      public void windowClosing(WindowEvent e) 
      { 
        ((Window)e.getSource()).dispose(); 
        System.exit(0); 
      } 
      }); 
    addMouseListener(new MouseAdapter(){ 
      int orgX; 
      int orgY; 
      public void mousePressed(MouseEvent e) 
      { 
        orgX=e.getX(); 
        orgY=e.getY(); 
      } 
      public void mouseReleased(MouseEvent e) 
      { 
        Graphics g=e.getComponent().getGraphics(); 
		  g.setColor(Color.red); 
        g.drawLine(orgX,orgY,e.getX(),e.getY()); 
        vLines.add(new MyLine(orgX,orgY,e.getX(),e.getY())); 
      } 
      }); 
    this.setSize(300,300); 
    setVisible(true); 
    
  } 
} 