package IOstreams;

import java.io.FileReader;
import java.io.IOException;

public class SampleReader {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("E:\\Tests\\writerSample.txt")) {
			
			int sybol;
			
			while ((sybol = reader.read()) != -1) {
				System.out.print((char) sybol);
			}
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
