/*P287
CardLayout ���ֹ������ܹ�ʵ�ֽ�����������ͬһ���������ڵĽ�����ʾ���൱��
���ſ�Ƭ����һ�����κ�ʱ��ֻ���������һ���ɼ���CardLayout �ṩ�˼���������
������ʾ�ض��Ŀ�Ƭ��Ҳ���԰��Ⱥ�˳��������ʾ��������ֱ�Ӷ�λ����һ�Ż����һ�š�
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
    Frame f=new Frame("���ֹ�����"); 
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