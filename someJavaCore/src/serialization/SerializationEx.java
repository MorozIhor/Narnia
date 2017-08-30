package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEx {
	
	private static final String PATH = "E:\\Tests\\object.txt";

	public static void main(String[] args) throws ClassNotFoundException {
		serialize();
		deserialize();

	}
	
	private static void serialize(){
		SerializableClass serClass = new SerializableClass(SerializableClass.class.getName(), 0);
		
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
			
			outputStream.writeObject(serClass);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void deserialize() throws ClassNotFoundException {
		
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH))) {
			
			SerializableClass serClass = (SerializableClass) inputStream.readObject();
			System.out.println("Title: "+ serClass.title + " size: " + serClass.size);
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	private static class SerializableClass implements Serializable {
		//Для того щоб параметр не збурігався під час серіалізації потрібно добавити transient
		private String title;
		private int size;
		
		SerializableClass(String title, int size) {
			this.title = title;
			this.size = size;
		}
		
	}

}
