/*P258����*/
import java.awt.*; 
import java.awt.event.*; 
public class DrawLine2 
{ 
  Frame f= new Frame("IT����Ѷ������"); 
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
        g.setColor(Color.red);//���û�ͼ��ɫΪ��ɫ 
        g.setFont(new Font("����",Font.ITALIC|Font.BOLD,30)); 
        //�����ı������� 
        g.drawString(new String(orgX +"," +orgY),orgX,orgY); 
        //��ӡ��갴��ʱ�������ı� 
        g.drawString(new String(e.getX() +"," +e.getY()) 
            ,e.getX(),e.getY()); 
        //��ӡ����ͷ�ʱ�������ı� 
        g.drawLine(orgX,orgY,e.getX(),e.getY()); 
      }  
    }); 
  } 
} 