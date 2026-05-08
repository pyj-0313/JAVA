package Ch07;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws IOException {
		
		String str = "문자 변환 스트림테스트!";
		
		//OUTPUT 보조스트림
		OutputStream out = new FileOutputStream("C:\\IOTEST\\test.txt");
//		out.write(str.getBytes());	//String -> byte[] 변환
		OutputStreamWriter wout = new OutputStreamWriter(out);
//		wout.write(str);
//		wout.flush();
		
		BufferedWriter bout = new BufferedWriter(wout);
		bout.write(str);
		bout.flush();
		
		out.close();
		
	}

}
