/*P288
9.2.7   ȡ�����ֹ����� 
����Ҳ�����þ�������ķ�ʽ��ָ�������λ�úʹ�С������������£���������Ҫ��
�� Container.setLayout(null)����ȡ�����ֹ��������ã�Ȼ����� Component.setBounds
����������ÿ������Ĵ�С��λ�á������ǲ�ʹ�ò��ֹ����������ӳ��� 
*/
import java.awt.*; 
import java.awt.event.*; 
public class TestNullLayout extends WindowAdapter 
{ 
  TestNullLayout() 
  { 
    Button b1=new Button("��һ����ť"); 
    Button b2=new Button("�ڶ�����ť"); 
    b1.setBounds(10,30,80,30); 
    b2.setBounds(60,70,100,20); 
    
    Frame f=new Frame("TestNullLayout"); 
    f.addWindowListener(this); 
    f.setLayout(null); 
      
    f.add(b1); 
    f.add(b2); 
    f.setBounds(0,0,200,200); 
    f.setVisible(true); 
  } 
  public static void main(String[] args) 
  { 
    new TestNullLayout();    
  } 
  public void windowClosing(WindowEvent e) 
  {System.exit(0);} 
} 