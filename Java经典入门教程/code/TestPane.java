/*P281代码

9.1.10    ScrollPane 类 
我们有时候需要在一个较小的容器窗口中，显示较大的子部件，这时就需要用到
ScrollPane类。ScrollPane 也是一种容器，不能单独使用，通过滚动窗口可以利用滚动条
查看大面积区域。ScrollPane中只能放置一个组件，无布局管理器。我们要将多个组件添
加到ScrollPane上，只能先将多个组件嵌套在一个 Panel容器中，然后将这个 Panel作为
一个组件放置到ScrollPane 上。下面是使用 ScrollPane的一个例子程序。 
*/
import java.awt.*;  
import java.awt.event.*; 
public class TestPane 
{ 
 
  TestPane() 
  { 
   Frame f=new Frame("TestDialog"); 
   ScrollPane sp = new ScrollPane(); 
   TextArea ta = new TextArea("",10,50,TextArea.SCROLLBARS_NONE);
   sp.add(ta); 
   
   f.add(sp); 
   f.setSize(200,200); 
   f.setVisible(true); 
   f.addWindowListener(new WindowAdapter(){ 
    public void windowClosing(WindowEvent e) 
    { 
      System.exit(0); 
      } 
   }); 
  } 
  public static void main(String[] args) 
  { 
   new TestPane();    
  } 
} 