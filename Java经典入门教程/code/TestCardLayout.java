/*P287
CardLayout 布局管理器能够实现将多个组件放在同一容器区域内的交替显示，相当于
多张卡片摞在一起，在任何时候都只有最上面的一个可见。CardLayout 提供了几个方法，
可以显示特定的卡片，也可以按先后顺序依此显示，还可以直接定位到第一张或最后一张。
*/
import java.awt.*; 
import java.awt.event.*; 
public class TestCardLayout 
{ 
  CardLayout cl = new CardLayout(); 
  Panel plCenter = new Panel(); 
  public static void main(String [] args) 
  { 
    new TestCardLayout().init(); 
  } 
  public void init() 
  { 
    Frame f=new Frame("布局管理器"); 
    Panel plWest = new Panel(); 
    f.add(plWest,"West"); 
	  f.add(plCenter); 
  
  plWest.setLayout(new GridLayout(3,1)); 
  Button btnPrev = new Button("prev"); 
  plWest.add(btnPrev); 
  Button btnNext = new Button("next"); 
  plWest.add(btnNext); 
  Button btnThree = new Button("three"); 
  plWest.add(btnThree); 
  
  plCenter.setLayout(cl); 
  plCenter.add(new Button("One"),"1"); 
  plCenter.add(new Button("two"),"2"); 
  plCenter.add(new Button("three"),"3"); 
  plCenter.add(new Button("four"),"4"); 
  plCenter.add(new Button("five"),"5"); 
  class MyActionListener implements ActionListener 
  { 
    public void actionPerformed(ActionEvent e) 
    { 
      if(e.getActionCommand().equals("prev")) 
        cl.previous(plCenter); 
      else if(e.getActionCommand().equals("next")) 
        cl.next(plCenter); 
      else if(e.getActionCommand().equals("three")) 
        cl.show(plCenter,"3"); 
    } 
  } 
  MyActionListener ma = new MyActionListener(); 
  btnPrev.addActionListener(ma); 
    btnNext.addActionListener(ma); 
    btnThree.addActionListener(ma); 
        
    f.setSize(300,300); 
    f.setVisible(true); 
  } 
} 