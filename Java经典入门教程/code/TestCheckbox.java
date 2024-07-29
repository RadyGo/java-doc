/*P271*/
import java.awt.*; 
import java.awt.event.*; 
public class TestCheckbox  
{ 
  Checkbox cb1=new Checkbox("你喜欢我吗？",true); 
  CheckboxGroup cbg=new CheckboxGroup(); 
  Checkbox cb2=new Checkbox("喜欢",cbg,true); 
  Checkbox cb3=new Checkbox("不喜欢",cbg,false); 
  
  public void init() 
  {    
    Frame f=new Frame("TestCheckBox"); 
	    //创建 FlowLayout 布局管理器，关于布局管理器，本章后面有专门的讲解，看不明白
//的读者暂时可以不去下面两句代码的作用。 
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
      if(cb.getLabel().equals("你喜欢我吗？")) 
		    { 
    if(cb.getState() == true) 
      System.out.println("我很高兴"); 
    else 
      System.out.println("我很伤心"); 
  } 
  /*else if(cb.getLabel().equals("喜欢")) 
  { 
    if(e.getStateChange() == ItemEvent.SELECTED) 
      System.out.println("我也喜欢你"); 
    else 
      System.out.println("我也不喜欢你"); 
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
