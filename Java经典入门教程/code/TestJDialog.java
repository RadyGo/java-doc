/*p292
9.3.5   �Ի��� 
�����ڳ����о���Ҫ��һ���򵥵ı�׼�Ի�������ʾ�û�������ʲô���飬 ����Ҫ����
��ȷ�ϻ�ȡ��һ����������AWT�У����Ǳ����Լ���ȫ��ʵ�������ĶԻ������ʹ������
�¼��� Swing Ϊ�����ṩ��һ��JOptionPane�࣬ JOptionPane �ṩ�����ɸ� showXxxDialog
��̬�������������������Щ���ܡ�Ʃ�磬�ڳ���ʼ����ʱ������һ���Ի�����ʾ�û���
���û��رմ���ʱ������ѯ���û��Ƿ����Ҫ�����������������ǵĳ�����롣 
*/

import javax.swing.*; 
import java.awt.event.*; 
class TestJDialog 
{ 
  public static void main(String [] args) 
  { 
    JOptionPane.showMessageDialog(null,"����ʼ����"); 
    final JFrame f = new JFrame("TestJDialog"); 
//Ҫ����������ʣ����Զ����final 
    f.setDefaultCloseOperation( 
WindowConstants.DO_NOTHING_ON_CLOSE); 
    //Container c = f.getContentPane(); 
     f.addWindowListener(new WindowAdapter() 
{ 
       public void windowClosing(WindowEvent e) 
       { 
         int retval = JOptionPane.showConfirmDialog(f, 
          "�����Ҫ������", 
"��������",JOptionPane.YES_NO_OPTION); 
         if(retval == JOptionPane.YES_OPTION) 
           System.exit(0); 
       } 
    }); 
    f.setSize(200,200); 
    f.setVisible(true); 
  } 
} 