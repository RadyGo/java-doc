/*p330
  简单的 TCP 服务器程序 */
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
br.close();//关闭包装类， 会自动关闭包装类中所包装的底层类。 所以不用调用ips.close() 
    //ips.close(); 
    ops.close(); 
    s.close(); 
    ss.close(); 
    }catch(Exception e){e.printStackTrace();} 
  } 
} 