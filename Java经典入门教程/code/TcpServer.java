/*p330
  �򵥵� TCP ���������� */
import java.net.*; 
import java.io.*; 
public class TcpServer 
{ 
	  public static void main(String [] args)  
  { 
    try 
    { 
    ServerSocket ss=new ServerSocket(23); 
    Socket s=ss.accept(); 
    InputStream ips=s.getInputStream(); 
    OutputStream ops=s.getOutputStream(); 
    ops.write("welcome to www.it315.org!".getBytes()); 
    byte [] buf = new byte[1024]; 
    //int len = ips.read(buf); 
    //System.out.println(new String(buf,0,len)); 
	BufferedReader br = new BufferedReader(new InputStreamReader(ips)); 
System.out.println(br.readLine()); 
br.close();//�رհ�װ�࣬ ���Զ��رհ�װ��������װ�ĵײ��ࡣ ���Բ��õ���ips.close() 
    //ips.close(); 
    ops.close(); 
    s.close(); 
    ss.close(); 
    }catch(Exception e){e.printStackTrace();} 
  } 
} 