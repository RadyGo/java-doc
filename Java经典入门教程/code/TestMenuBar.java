/*P275代码

对于发出 ActionEvent事件的组件，我们可以调用 setActionCommand 方法为其关联一
个字符串，用于指示这个动作想执行的命令。如果程序没有使用 setActionCommand 方法为
组件关联一个命令字符串，则其命令字符串为组件的标题文本。ActionEvent 的
ActionEvent 的getActionCommand 方法就是用于返回这个命令字符串的
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
  MenuBar menubar=new MenuBar(); //创建菜单条对象 
  Menu fileM=new Menu("File"); //创建各菜单 
  Menu editM=new Menu("Edit"); //创建各菜单 
  Menu toolsM=new Menu("Tools"); //创建各菜单 
  Menu helpM=new Menu("Help"); //创建各菜单 
    
  MenuItem fileMI1=new MenuItem("New"); //创建各菜单项 
  MenuItem fileMI2=new MenuItem("Open"); //创建各菜单项 
  MenuItem fileMI3=new MenuItem("Save"); //创建各菜单项 
  CheckboxMenuItem fileMI5=new CheckboxMenuItem("Quit",true); 
   //创建各菜单项 
    
      Menu filePrint = new Menu("print");//创建子菜单 
      MenuItem printM1 = new MenuItem("preview"); 
      MenuItem printM2 = new MenuItem("setting"); 
      
  TestMenuBar() 
  { 
    FlowLayout fl=new FlowLayout(); 
    
    Frame f=new Frame("TestMenuBar"); 
    f.setLayout(fl); 
  menubar.add(fileM); //将菜单加入菜单条 
  menubar.add(editM);  
  menubar.add(toolsM);  
  menubar.add(helpM);  
  
  fileM.add(fileMI1); //将菜单项加入file菜单中 
  fileM.add(fileMI2);  
  fileM.add(fileMI3); 
  
  filePrint.add(printM1);//将菜单项加入print菜单中 
  filePrint.add(printM2); 
  fileM.add(filePrint); //将print菜单作为一个菜单项加入file菜单中 
  
  fileM.addSeparator(); //将一条分割线加入菜单中 
    fileM.add(fileMI5); //将菜单项加入菜单中 
    f.setMenuBar(menubar); //把整个菜单系统显示在窗口中 
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

