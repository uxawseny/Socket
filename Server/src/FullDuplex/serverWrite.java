package FullDuplex;

import java.net.Socket;

public class serverWrite implements Runnable {
	
	Socket s;
	
	public serverWrite(Socket s) {
		this.s = s;
	}

	
	public void run() {
		
		try {
			Tool.sendData(s);
		} catch (Exception e) {
			
		}
	}

}
