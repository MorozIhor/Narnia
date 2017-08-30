package IOstreams;

import java.io.FileWriter;
import java.io.IOException;

public class SampleWriter {

	public static void main(String[] args) {
		
		String text = "Hi Java !!! ";
		char [] chars = new char[text.length()];
		text.getChars(0, chars.length, chars, 0);
		
		try (FileWriter writer = new FileWriter("E:\\Tests\\writerSample.txt")) {
			
			for (char c : chars) {
				writer.write(c);
			}
			
			
		}catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
