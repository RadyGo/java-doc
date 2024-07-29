/*P283代码
9.2.2    BorderLayout 
BorderLayout 将容器划分为东、南、西、北、中五个区域
我们将组件添加到容器时，需要指定组件放置的区域。当改变容器大小时，北方和南方
的组件只改变宽度，东方和西方的组件只改变高度，而中间组件宽度和高度都会改变。在
BorderLayout 布局管理下，这个管理器允许最多放置五个组件，如果我们想在窗口上放置
更多的组件， 可以将若干组件添加到一个Panel 上，然后将这个 Panel作为一个组件放置到
窗口上。 当容器上放置的组件少于五个， 没有放置组件的区域将被相邻的区域占用。对Frame
和Dialog来说，默认的布局管理器就是BorderLayout布局管理器
如果我们在使用Container.add 方法，没有指定位置参数时，AWT 会用“Center”作为这个组件的放置位置。注意，位置参数的字符串的书写是非常严格的，不能有任何大小
写问题，必须是大写。
*/
  import java.awt.*; 
public class TestBorderLayout 
{ 
  public static void main(String [] args) 
  { 
    Frame f=new Frame("布局管理器"); 
    f.add(new Button("第一个按钮"), "North")
    f.add(new Button("第二个按钮")); //没有指定布局管理器，默认的 BorderLayout 布局管理器就把两个组件都放在中间了，
    f.setSize(300,300); 
    f.setVisible(true); 
  } 
} 