package FullDuplex;

import java.net.Socket;

public class serverRead implements Runnable {
	
	Socket s;
	
	public serverRead(Socket s) {
		this.s=s;
	}

	
	public void run() {
		
		try {
			Tool.receiveData(s);
		} catch (Exception e) {
			
		}
	}

}
