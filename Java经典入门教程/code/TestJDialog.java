/*p292
9.3.5   对话框 
我们在程序中经常要用一个简单的标准对话框来提示用户发生了什么事情， 或者要求用
户确认或取消一个动作。在AWT中，我们必需自己完全来实现这样的对话框界面和处理相关
事件， Swing 为我们提供了一个JOptionPane类， JOptionPane 提供了若干个 showXxxDialog
静态方法，来帮我们完成这些功能。譬如，在程序开始启动时，弹出一个对话框提示用户，
在用户关闭窗口时，我们询问用户是否真的要结束程序，下面是我们的程序代码。 
*/

import javax.swing.*; 
import java.awt.event.*; 
class TestJDialog 
{ 
  public static void main(String [] args) 
  { 
    JOptionPane.showMessageDialog(null,"程序开始启动"); 
    final JFrame f = new JFrame("TestJDialog"); 
//要被内置类访问，所以定义成final 
    f.setDefaultCloseOperation( 
WindowConstants.DO_NOTHING_ON_CLOSE); 
    //Container c = f.getContentPane(); 
     f.addWindowListener(new WindowAdapter() 
{ 
       public void windowClosing(WindowEvent e) 
       { 
         int retval = JOptionPane.showConfirmDialog(f, 
          "你真的要结束吗？", 
"结束程序",JOptionPane.YES_NO_OPTION); 
         if(retval == JOptionPane.YES_OPTION) 
           System.exit(0); 
       } 
    }); 
    f.setSize(200,200); 
    f.setVisible(true); 
  } 
} 