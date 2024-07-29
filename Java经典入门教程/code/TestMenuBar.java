/*P275����

���ڷ��� ActionEvent�¼�����������ǿ��Ե��� setActionCommand ����Ϊ�����һ
���ַ���������ָʾ���������ִ�е�����������û��ʹ�� setActionCommand ����Ϊ
�������һ�������ַ��������������ַ���Ϊ����ı����ı���ActionEvent ��
ActionEvent ��getActionCommand �����������ڷ�����������ַ�����
*/
import java.awt.*; 
import java.awt.event.*; 

class MenuListener implements ActionListener 
{ 
  public void actionPerformed(ActionEvent e) 
  { 
    if(e.getActionCommand().equals("preview")) 
      System.out.println("doing preview"); 
    else if(e.getActionCommand().equals("setting"))   
		System.out.println("doing setting"); 
  }
}

public class TestMenuBar  
{ 
  MenuBar menubar=new MenuBar(); //�����˵������� 
  Menu fileM=new Menu("File"); //�������˵� 
  Menu editM=new Menu("Edit"); //�������˵� 
  Menu toolsM=new Menu("Tools"); //�������˵� 
  Menu helpM=new Menu("Help"); //�������˵� 
    
  MenuItem fileMI1=new MenuItem("New"); //�������˵��� 
  MenuItem fileMI2=new MenuItem("Open"); //�������˵��� 
  MenuItem fileMI3=new MenuItem("Save"); //�������˵��� 
  CheckboxMenuItem fileMI5=new CheckboxMenuItem("Quit",true); 
   //�������˵��� 
    
      Menu filePrint = new Menu("print");//�����Ӳ˵� 
      MenuItem printM1 = new MenuItem("preview"); 
      MenuItem printM2 = new MenuItem("setting"); 
      
  TestMenuBar() 
  { 
    FlowLayout fl=new FlowLayout(); 
    
    Frame f=new Frame("TestMenuBar"); 
    f.setLayout(fl); 
  menubar.add(fileM); //���˵�����˵��� 
  menubar.add(editM);  
  menubar.add(toolsM);  
  menubar.add(helpM);  
  
  fileM.add(fileMI1); //���˵������file�˵��� 
  fileM.add(fileMI2);  
  fileM.add(fileMI3); 
  
  filePrint.add(printM1);//���˵������print�˵��� 
  filePrint.add(printM2); 
  fileM.add(filePrint); //��print�˵���Ϊһ���˵������file�˵��� 
  
  fileM.addSeparator(); //��һ���ָ��߼���˵��� 
    fileM.add(fileMI5); //���˵������˵��� 
    f.setMenuBar(menubar); //�������˵�ϵͳ��ʾ�ڴ����� 
    f.setBounds(0,0,250,200); 
    f.setVisible(true); 
    f.addWindowListener(new WindowAdapter() 
	{ 
      public void windowClosing(WindowEvent e) 
      { 
        System.exit(0); 
      } 
    }); 
	MenuListener ml = new MenuListener(); 
	printM1.addActionListener(ml); 
	printM2.addActionListener(ml); 
  }   
  
  public static void main(String[] args) 
  { 
    new TestMenuBar(); 
  } 
} 

