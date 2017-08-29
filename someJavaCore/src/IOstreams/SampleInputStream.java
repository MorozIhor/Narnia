package IOstreams;

import java.io.FileInputStream;
import java.io.IOException;

public class SampleInputStream {

	public static void main(String[] args) {
		
		try (FileInputStream stream = new FileInputStream("E:\\Tests\\sample.txt")){
			
			int someB;
			
			while((someB = stream.read()) != -1){
				System.out.print((char) someB );
			}
			
		}catch (IOException e){
			System.out.println("Input error");
		}

	}

}
