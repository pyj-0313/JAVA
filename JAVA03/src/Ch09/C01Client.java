package Ch09;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket server = new Socket("192.168.5.13",7000);
		
		InputStream in = server.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println("메시지 : " + recv);
		
		din.close();
		in.close();
		server.close();

	}

}
