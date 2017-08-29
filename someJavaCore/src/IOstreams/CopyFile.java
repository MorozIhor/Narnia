package IOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		String original = "E:\\Tests\\sample.txt";
		String copy = "E:\\Tests\\copySample.txt";
		
		try (FileInputStream fis = new FileInputStream(original); 
				FileOutputStream fos = new FileOutputStream(copy)) {
			
			int s = fis.read();
			while (s != -1) {
				fos.write(s);
				s = fis.read();
			}
			
		}catch (IOException e) {
			System.out.println("IO Exception");
		}

	}

}
