/*P265

import java.awt.*; 
import java.awt.event.*; 
public class DrawImage 
{ 
    public static void main(String [] args) 
    { 
      Frame f= new Frame("IT人资讯交流网"); 
	  f.setSize(300,300); 
      f.setVisible(true); 
      f.addWindowListener(new WindowAdapter(){ 
public void windowClosing(WindowEvent e) 
        { 
          System.exit(0); 
        } 
        }); 

      Image img=f.getToolkit().getImage("c:\\test.gif"); 
      f.getGraphics().drawImage(img,0,0, f); 
      
    } 
} 
因为在窗口初始显示时也会被调用
paint方法，paint方法会擦除窗口上绘制的图形，这里的 drawImage方法先于paint方法
执行， 所以， drawImage方法绘制的图像被 paint方法擦除掉了。 读者不要误以为 setVisible
方法执行时，paint 方法就会立即执行，paint 方法是由 AWT 线程调度和管理的。顺便告诉
大家另外一个小经验，放在 Frame.setVisible(true)之后的 GUI 程序代码，在窗口初始显
示时，都看不出期望的执行效果。 例如， f.setVisible(true);f.add(new  Button(“test”);
这样的程序代码，我们在窗口初始显示时也是看不到窗口上放置的按钮的，改为f.add(new 
Button(“test”); f.setVisible(true);这样的顺序则可以了。对于上面的问题，我们可
以将图像放在paint方法中显示，修改后的程序如下：
*/
import java.awt.*; 
import java.event.*; 
public class DrawImage extends Frame 
{ 
	Image img=null; 
    public static void main(String [] args) 
    { 
      DrawImage f= new DrawImage(); 
      f.init(); 
    } 
    public void init() 
    { 
      img=this.getToolkit().getImage("c:\\test.gif"); 
	  setSize(300,300); 
      setVisible(true); 
      this.addWindowListener(new WindowAdapter(){ 
public void windowClosing(WindowEvent e) 
        { 
          System.exit(0); 
        } 
        }); 
      //img=this.getToolkit().getImage("c:\\test.gif"); 
	  /*。原因在于，这时候正好碰到了 AWT线程调用
paint方法早于getImage方法的情况，而在 paint方法中执行 drawImage的时候，img对象
仍为null。我们将调用getImage 方法的语句放在 setVisible 语句之前，这样就万无一失，
一切正常了*/
    } 
    public void paint(Graphics g) 
    { 
        getGraphics().drawImage(img,0,0,this);  
    } 
}