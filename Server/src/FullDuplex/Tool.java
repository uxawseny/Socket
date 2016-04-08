package FullDuplex;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Tool {
	
	public static void sendData(Socket s) throws Exception{
		
		while(true){
			//System.out.print("服务端：   ");
			InputStream in = System.in;
			byte[]  b = new byte[1024];
			OutputStream os = s.getOutputStream();
			while(in.read(b)!=-1)
				os.write(b);
		}
	}
	
	public static void receiveData(Socket s) throws Exception{
		
		while(true){
			BufferedReader is = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//System.out.println("客户端：   "+is.readLine());
			System.out.println(is.readLine());
			//is.close();
		}
		
		
		//s.close();
	}
}
