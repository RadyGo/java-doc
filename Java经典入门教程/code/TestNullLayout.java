/*P288
9.2.7   取消布局管理器 
我们也可以用绝对坐标的方式来指定组件的位置和大小，在这种情况下，我们首先要调
用 Container.setLayout(null)方法取消布局管理器设置，然后调用 Component.setBounds
方法来设置每个组件的大小和位置。下面是不使用布局管理器的例子程序： 
*/
import java.awt.*; 
import java.awt.event.*; 
public class TestNullLayout extends WindowAdapter 
{ 
  TestNullLayout() 
  { 
    Button b1=new Button("第一个按钮"); 
    Button b2=new Button("第二个按钮"); 
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