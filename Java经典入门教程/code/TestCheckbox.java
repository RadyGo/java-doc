/*P271*/
import java.awt.*; 
import java.awt.event.*; 
public class TestCheckbox  
{ 
  Checkbox cb1=new Checkbox("��ϲ������",true); 
  CheckboxGroup cbg=new CheckboxGroup(); 
  Checkbox cb2=new Checkbox("ϲ��",cbg,true); 
  Checkbox cb3=new Checkbox("��ϲ��",cbg,false); 
  
  public void init() 
  {    
    Frame f=new Frame("TestCheckBox"); 
	    //���� FlowLayout ���ֹ����������ڲ��ֹ����������º�����ר�ŵĽ��⣬��������
//�Ķ�����ʱ���Բ�ȥ���������������á� 
    FlowLayout fl=new FlowLayout(); 
    f.setLayout(fl); 
      
    f.add(cb1); 
    f.add(cb2); 
    f.add(cb3); 
    cb1.addItemListener(new CbItemListener()); 
    cb2.addItemListener(new CbItemListener()); 
    cb3.addItemListener(new CbItemListener()); 
    f.setBounds(0,0,300,100); 
    f.setVisible(true); 
      f.addWindowListener(new WindowAdapter() 
{ 
public void windowClosing(WindowEvent e) 
        { 
          System.exit(0); 
        } 
      }); 
  } 
  class CbItemListener implements ItemListener 
  { 
    public void itemStateChanged(ItemEvent e) 
    { 
      Checkbox cb = (Checkbox)e.getItemSelectable(); 
      if(cb.getLabel().equals("��ϲ������")) 
		    { 
    if(cb.getState() == true) 
      System.out.println("�Һܸ���"); 
    else 
      System.out.println("�Һ�����"); 
  } 
  /*else if(cb.getLabel().equals("ϲ��")) 
  { 
    if(e.getStateChange() == ItemEvent.SELECTED) 
      System.out.println("��Ҳϲ����"); 
    else 
      System.out.println("��Ҳ��ϲ����"); 
  }*/ 
  else 
  { 
    Checkbox cbx =cbg.getSelectedCheckbox(); 
    if(cbx != null) 
          System.out.println(cbx.getLabel()); 
      } 
    } 
  } 
  public static void main(String[] args) 
  { 
    new TestCheckbox().init();   
  } 
} 
