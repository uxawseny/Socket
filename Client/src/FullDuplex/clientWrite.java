package FullDuplex;
import java.net.Socket;

public class clientWrite implements Runnable {

	Socket s;
	
	public clientWrite(Socket s) {
		this.s=s;
	}

	public void run() {
		
		try {
			Tool.sendData(s);
		} catch (Exception e) {
			
		}
	}

}
