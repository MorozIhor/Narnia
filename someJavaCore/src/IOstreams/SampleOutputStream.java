package IOstreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class SampleOutputStream {

	public static void main(String[] args) {
		
		String str = "Hello World !";
		byte [] bytes = str.getBytes();
		
		try (FileOutputStream stream = new FileOutputStream("E:\\Tests\\sample.txt")){
			
			for (byte b : bytes) {
				stream.write(b);
			}
			
		}catch (IOException e){
			System.out.println("Output error");
		}

	}

}
