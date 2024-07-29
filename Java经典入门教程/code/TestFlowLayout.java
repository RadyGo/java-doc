/*P284
9.2.3    FlowLayout 
  FlowLayout 是一个简单的布局风格，组件从左到右，从上到下依此排列。如果一个组
件在本行放不下，就自动换到下一行的开始。FlowLayout是 Panel和 applet的默认布局管
理器。调用 Container.setLayout 方法，就可以改变容器的布局管理器，下面是使用
FlowLayout的例子程序。 
*/
  import java.awt.*; 
  public class TestFlowLayout 
  { 
    public static void main(String [] args) 
    { 
      Frame f=new Frame(“布局管理器”); 
      f.setLayout(new FlowLayout()); 
     f.add(new Button(“第一个按钮”),”North”); 
      f.add(new Button(“第二个按钮”)); 
     f.add(new Button(“第三个按钮”),”South”); 
      f.add(new Button(“第四个按钮”)); 
      f.setSize(300,300); 
      f.setVisible(true); 
	}
  }