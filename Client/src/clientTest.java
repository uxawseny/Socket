import java.net.Socket;

import FullDuplex.clientRead;
import FullDuplex.clientWrite;

public class clientTest {

	public static void main(String[] args) throws Exception {
	
		Socket s  =new Socket("127.0.0.1", 10000);
		
		Thread cr =new Thread(new clientRead(s));
		cr.start();
		System.out.println("�ͻ��˶��߳�"+cr.getName()+"����");
		
		Thread cw =new Thread(new clientWrite(s));
		cw.start();
		System.out.println("�ͻ���д�߳�"+cw.getName()+"����");
	}

}
