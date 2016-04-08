package FullDuplex;

import java.net.Socket;

public class clientRead  implements Runnable{
	
	
	Socket s;
	
	public clientRead(Socket s) {
		this.s=s;
	}

	public void run() {
		
		try {
			Tool.receiveData(s);
		} catch (Exception e) {
			
		}
		
		
	}
	
}
