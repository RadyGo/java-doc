/*P273代码*/
import java.awt.*; 
import java.awt.event.*; 
public class TestChoice  
{ 
  Choice ch=new Choice(); //创建Choice对象 
  TestChoice() 
  { 
    ch.add("choice1"); //用add方法向列表里加入选项 
    ch.add("choice2"); //用add方法向列表里加入选项 
    ch.add("choice3"); //用add方法向列表里加入选项 
    FlowLayout fl=new FlowLayout(); 
    Frame f=new Frame("TestChoice"); 
    f.setLayout(fl); 
    f.add(ch); //把列表加入到窗口 
    f.setBounds(0,0,200,100); 
    f.setVisible(true); 
    f.addWindowListener(new WindowAdapter() 
		{ 
public void windowClosing(WindowEvent e) 
      { 
        System.exit(0); 
      } 
    }); 
  } 
  
  public static void main(String[] args) 
  { 
    new TestChoice();    
       } 
} 
