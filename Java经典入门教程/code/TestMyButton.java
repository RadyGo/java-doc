/*P256代码*/
import java.awt.*; 
import java.awt.event.*; 
class MyButton extends Button 
{ 
  private MyButton friend; 
  public void setFriend(MyButton friend) 
  { 
    this.friend = friend; 
  } 
  public MyButton(String name) 
  { 
    super(name);
	    enableEvents(AWTEvent.MOUSE_MOTION_EVENT_MASK); 
  } 
  protected void processMouseMotionEvent(MouseEvent e) 
  { 
    setVisible(false); 
    friend.setVisible(true); 
  } 
} 
public class TestMyButton 
{ 
  public static void main(String [] args) 
  { 
    MyButton btn1 =new MyButton("你来抓我呀!"); 
    MyButton btn2 =new MyButton("你来抓我呀!"); 
    btn1.setFriend(btn2); 
    btn2.setFriend(btn1); 
    btn1.setVisible(false); 
    Frame f =new Frame("it315"); 
    f.add(btn1, "North");//将btn1增加到f的北部 
    f.add(btn2, "South");//将btn2增加到f的南部 
    f.setSize(300,300); 
    f.setVisible(true); 
    btn1.setVisible(false);  
  } 
} 