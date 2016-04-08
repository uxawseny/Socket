import java.net.ServerSocket;
import java.net.Socket;

import FullDuplex.serverRead;
import FullDuplex.serverWrite;


public class serverTest {
		public static void main(String[] args) throws Exception{
			
			ServerSocket ss =new ServerSocket(10000);
			Socket s = ss.accept();
			
			Thread sr =new Thread(new serverRead(s));
			sr.start();
			System.out.println("服务端读线程"+sr.getName()+"开启");
			
			Thread sw =new Thread(new serverWrite(s));
			sw.start();
			System.out.println("服务端写线程"+sw.getName()+"开启");
		}
}
