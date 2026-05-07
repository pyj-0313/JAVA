package Ch06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws URISyntaxException, IOException {
		// URL : https://news.naver.com/section/105
		
		URL url = (new URI("https://news.naver.com/section/105")).toURL();
		//기본스트림 추출
		InputStream in = url.openStream();
		
		//보조스트림 추가
		BufferedInputStream buffIn = new BufferedInputStream(in);	//보조스트릠(버퍼추가) 추가
		Reader rin = new InputStreamReader(buffIn);		//보조스트림(byte->char) 추가
		
		//기본스트림(OUT) 생성
		Writer fout = new FileWriter("C:\\IOTEST\\index.html");
		
		//
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			
			fout.write((char)data);
			fout.flush();
		}
		
		//역순으로 닫아주기
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
		
	}

}
