/*P284
9.2.3    FlowLayout 
  FlowLayout ��һ���򵥵Ĳ��ַ����������ң����ϵ����������С����һ����
���ڱ��зŲ��£����Զ�������һ�еĿ�ʼ��FlowLayout�� Panel�� applet��Ĭ�ϲ��ֹ�
���������� Container.setLayout �������Ϳ��Ըı������Ĳ��ֹ�������������ʹ��
FlowLayout�����ӳ��� 
*/
  import java.awt.*; 
  public class TestFlowLayout 
  { 
    public static void main(String [] args) 
    { 
      Frame f=new Frame(�����ֹ�������); 
      f.setLayout(new FlowLayout()); 
     f.add(new Button(����һ����ť��),��North��); 
      f.add(new Button(���ڶ�����ť��)); 
     f.add(new Button(����������ť��),��South��); 
      f.add(new Button(�����ĸ���ť��)); 
      f.setSize(300,300); 
      f.setVisible(true); 
	}
  }